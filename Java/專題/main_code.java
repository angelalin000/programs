import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class main_code extends JFrame implements KeyListener {
    int x1 = (int) (Math.random() * 3);
    int x2 = (int) (Math.random() * 3);
    int x3 = (int) (Math.random() * 3);
    int x4 = (int) (Math.random() * 3);
    int x5 = (int) (Math.random() * 3);

    int score = 0, bscore = 0;
    int t = 33;
    int flag = 0;
    Timer time;
    JLabel lbScore;
    JLabel lbStop = new JLabel("");

    Sound bg = new Sound();
    Sound bgm = new Sound();

    // birds images
    ImageIcon WBIcon = new ImageIcon("images\\Wbird.png");
    Image WB = WBIcon.getImage();
    Image WBim = WB.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
    ImageIcon WBic = new ImageIcon(WBim);

    ImageIcon GBIcon = new ImageIcon("images\\Gbird.png");
    Image GB = GBIcon.getImage();
    Image GBim = GB.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
    ImageIcon GBic = new ImageIcon(GBim);

    JLabel lb1 = new JLabel(WBic);
    JLabel lb2 = new JLabel(WBic);
    JLabel lb3 = new JLabel(WBic);
    JLabel lb4 = new JLabel(WBic);
    JLabel lb5 = new JLabel(WBic);

    public main_code() {
        init();
    }

    private void init() {
        Container cp = this.getContentPane();

        // 視窗圖案
        this.setIconImage(GBIcon.getImage());

        this.setTitle("Game!");
        this.setBounds(300, 50, 300, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setFocusable(true); // ***設定鍵盤成主要監控目標
        this.addKeyListener(this);
        cp.setLayout(new BorderLayout());

        // 上方panel(p1)////////////////////////////////////
        JPanel p1 = new JPanel(new GridLayout(1, 4));
        p1.setBackground(Color.white);

        lbScore = new JLabel("Score: " + score);
        JLabel lbTime = new JLabel("Time: 30");
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");

        btnStart.setBackground(Color.white);
        btnStop.setBackground(Color.white);
        btnStop.setEnabled(false);
        p1.add(lbScore);
        p1.add(lbTime);
        p1.add(btnStart);
        p1.add(btnStop);

        cp.add(p1, BorderLayout.NORTH);
        /////////////////////////////////////////////////////

        // 下方panel(p2)//////////////////////////////////////
        JPanel p2 = new JPanel();
        p2.setLayout(null);

        // 暫停標籤
        lbStop.setBackground(Color.white);
        lbStop.setBounds(110, 180, 100, 25);
        p2.add(lbStop);
        lbStop.setText("");

        ////// 倒數
        JLabel lbcd = new JLabel("");
        lbcd.setBounds(142, 205, 25, 25);
        lbcd.setBackground(Color.WHITE);
        Font word = new Font(Font.SERIF, Font.PLAIN, 30);
        lbcd.setForeground(Color.BLUE);
        lbcd.setFont(word);
        p2.add(lbcd);

        ////// birds
        lb1.setBounds((30 + x1 * 90), 5, 60, 60);
        lb2.setBounds((30 + x2 * 90), 80, 60, 60);
        lb3.setBounds((30 + x3 * 90), 155, 60, 60);
        lb4.setBounds((30 + x4 * 90), 230, 60, 60);
        lb5.setBounds((30 + x5 * 90), 305, 60, 60);

        p2.add(lb1);
        p2.add(lb2);
        p2.add(lb3);
        p2.add(lb4);
        p2.add(lb5);

        ////// 文字
        JLabel lbg = new JLabel("G");
        JLabel lbh = new JLabel("H");
        JLabel lbj = new JLabel("J");

        lbg.setBounds(56, 400, 20, 20);
        lbh.setBounds(146, 400, 20, 20);
        lbj.setBounds(236, 400, 20, 20);

        p2.add(lbg);
        p2.add(lbh);
        p2.add(lbj);

        ////// cat's hands
        ImageIcon C0Icon = new ImageIcon("images\\cat0.png");
        ImageIcon C1Icon = new ImageIcon("images\\cat1.png");
        ImageIcon C2Icon = new ImageIcon("images\\cat2.png");

        Image c0 = C0Icon.getImage();
        Image c0im = c0.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon C0ic = new ImageIcon(c0im);

        Image c1 = C1Icon.getImage();
        Image c1im = c1.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon C1ic = new ImageIcon(c1im);

        Image c2 = C2Icon.getImage();
        Image c2im = c2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon C2ic = new ImageIcon(c2im);

        JLabel lbc0 = new JLabel(C0ic);
        JLabel lbc1 = new JLabel(C1ic);
        JLabel lbc2 = new JLabel(C2ic);

        lbc0.setBounds(30, 380, 60, 60);
        lbc1.setBounds(120, 380, 60, 60);
        lbc2.setBounds(210, 380, 60, 60);

        p2.add(lbc0);
        p2.add(lbc1);
        p2.add(lbc2);

        ////// background
        ImageIcon BGIcon = new ImageIcon("images\\ground.jpg");
        Image BG = BGIcon.getImage();
        Image BGim = BG.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
        ImageIcon BGic = new ImageIcon(BGim);

        JLabel lbbg = new JLabel(BGic);
        lbbg.setBounds(0, 0, 300, 500);
        p2.add(lbbg);

        cp.add(p2, BorderLayout.CENTER);
        //////////////////////////////////////////////

        // 計時
        time = new Timer(1000 * 1, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t > 30) {
                    // 倒數
                    bg.setFile(1);
                    bg.play();
                    lbcd.setText("" + (t - 30));
                    t--;
                } else if (t == 30) {
                    // 音效
                    bgm.setFile(0);
                    bgm.play();
                    flag = 1;
                    lbScore.setText("Score: " + score);
                    lbTime.setText("Time: " + t);
                    lbcd.setText("");
                    t--;
                } else if (t == 0) {
                    // 時間到
                    bgm.stop();
                    flag = 0;
                    lbTime.setText("Time: " + t);
                    time.stop();
                    btnStart.setEnabled(true);
                    btnStop.setEnabled(false);
                    if (score > bscore) {
                        bscore = score;
                    }
                    JOptionPane.showMessageDialog(cp, "\t\tYour Score is " + score + "\n\t\tBest score: " + bscore,
                            "Time's up", JOptionPane.PLAIN_MESSAGE, GBic);

                    t = 33;
                    score = 0;
                    lbTime.setText("Time: 30");
                    lbScore.setText("Score: " + score);

                } else {
                    lbTime.setText("Time: " + t);
                    lbcd.setText("");
                    t--;
                }
            }
        });

        // 按鈕
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (t <= 30) {
                    // 音效
                    bgm.play();
                    flag = 1;
                }
                btnStart.setEnabled(false);
                btnStop.setEnabled(true);
                time.start();
                lbStop.setText("");
            }
        });

        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // 音效
                if (t <= 30) {
                    bgm.stop();
                }
                flag = 0;
                btnStop.setEnabled(false);
                btnStart.setEnabled(true);
                time.stop();
                lbStop.setText("You stop now.");
            }
        });

        this.setVisible(true);
    }

    // 鍵盤事件
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (flag == 1) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_G) {
                key = 0;
            } else if (key == KeyEvent.VK_H) {
                key = 1;
            } else if (key == KeyEvent.VK_J) {
                key = 2;
            }

            if (key == x5) {
                // 音效
                bg.setFile(2);
                bg.play();

                // 變更bird's 位置
                x5 = x4;
                x4 = x3;
                x3 = x2;
                x2 = x1;
                x1 = (int) (Math.random() * 3);

                lb1.setBounds((30 + x1 * 90), 5, 60, 60);
                lb2.setBounds((30 + x2 * 90), 80, 60, 60);
                lb3.setBounds((30 + x3 * 90), 155, 60, 60);
                lb4.setBounds((30 + x4 * 90), 230, 60, 60);
                lb5.setBounds((30 + x5 * 90), 305, 60, 60);

                // 變更分數
                score++;
                lbScore.setText("Score: " + score);
            } else if (key >= 0 && key <= 2) {
                // 音效
                bg.setFile(3);
                bg.play();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new main_code();
    }
}