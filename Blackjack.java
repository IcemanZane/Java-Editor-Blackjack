import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * Description
 *
 * @version 1.0 from 16/05/2023
 * @author 
 */

public class Blackjack extends JFrame {
  // start attributes
  private JTextArea menu_rulesText = new JTextArea();
  private JScrollPane menu_rulesTextScrollPane = new JScrollPane(menu_rulesText);
  private JButton menu_rulesButton = new JButton();
  private JButton menu_rulesCloseButton = new JButton();
  private JLabel backgroundLabel = new JLabel();
    private ImageIcon backgroundLabelIcon = new ImageIcon(getClass().getResource("images/Background.png"));
  // end attributes
  private JLabel ingame_dealerHand1Hider = new JLabel();
  private ImageIcon ingame_dealerHand1HiderIcon = new ImageIcon(getClass().getResource("images/back.png"));
  private JButton ingame_finish = new JButton();
  private JLabel ingame_dealerBustBet = new JLabel();
  private JNumberField menu_wins = new JNumberField();
  private JNumberField menu_losses = new JNumberField();
  private JNumberField menu_ties = new JNumberField();
  private JNumberField menu_blackjacks = new JNumberField();
  private JLabel menu_winsLabel = new JLabel();
  private JLabel ingame_dealerHand1 = new JLabel();
  private JNumberField menu_bet = new JNumberField();
  private JButton menu_start = new JButton();
  private JCheckBox menu_dealerBustCheckBox = new JCheckBox();
  private JNumberField menu_dealerBustBet = new JNumberField();
  private JButton ingame_stand = new JButton();
  private JButton ingame_hit = new JButton();
  private JButton ingame_doubleDown = new JButton();
  private JLabel menu_betLabel = new JLabel();
  private JLabel menu_dealerBustBetLabel = new JLabel();
  private JLabel menu_balanceLabel = new JLabel();
  private JNumberField menu_balance = new JNumberField();
  private JLabel ingame_userHandLabel = new JLabel();
  private JLabel ingame_dealerHandLabel = new JLabel();
  private JLabel menu_console = new JLabel();
  private JLabel ingame_bet = new JLabel();
  private JLabel ingame_console = new JLabel();
  private JLabel ingame_balance = new JLabel();
  private JButton menu_restart = new JButton();
  private JLabel ingame_userHand1 = new JLabel();
  private ImageIcon ingame_userHand1Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand2 = new JLabel();
  private ImageIcon ingame_userHand2Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand3 = new JLabel();
  private ImageIcon ingame_userHand3Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand4 = new JLabel();
  private ImageIcon ingame_userHand4Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand5 = new JLabel();
  private ImageIcon ingame_userHand5Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand2 = new JLabel();
  private ImageIcon ingame_dealerHand2Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand3 = new JLabel();
  private ImageIcon ingame_dealerHand3Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand4 = new JLabel();
  private ImageIcon ingame_dealerHand4Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand5 = new JLabel();
  private ImageIcon ingame_dealerHand5Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand6 = new JLabel();
  private ImageIcon ingame_userHand6Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand7 = new JLabel();
  private ImageIcon ingame_userHand7Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand8 = new JLabel();
  private ImageIcon ingame_userHand8Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand9 = new JLabel();
  private ImageIcon ingame_userHand9Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_userHand10 = new JLabel();
  private ImageIcon ingame_userHand10Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand6 = new JLabel();
  private ImageIcon ingame_dealerHand6Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand7 = new JLabel();
  private ImageIcon ingame_dealerHand7Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand8 = new JLabel();
  private ImageIcon ingame_dealerHand8Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand9 = new JLabel();
  private ImageIcon ingame_dealerHand9Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel ingame_dealerHand10 = new JLabel();
  private ImageIcon ingame_dealerHand10Icon = new ImageIcon(getClass().getResource("images/back.png"));
  private JLabel menu_lossesLabel = new JLabel();
  private JLabel menu_tiesLabel = new JLabel();
  private JLabel menu_blackjacksLabel = new JLabel();
  
  int round = 3;
  int dround = 3;
  boolean uAce = false;
  boolean uAceBust = false;
  boolean dAce = false;
  boolean dAceBust = false;
  int userHandTotal = 0;
  int dealerHandTotal = 0;
  public Blackjack() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1381; 
    int frameHeight = 795;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Blackjack");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    menu_rulesCloseButton.setBounds(1248, 96, 24, 24);
    menu_rulesCloseButton.setText("x");
    menu_rulesCloseButton.setMargin(new Insets(2, 2, 2, 2));
    menu_rulesCloseButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        menu_rulesCloseButton_ActionPerformed(evt);
      }
    });
    menu_rulesCloseButton.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(menu_rulesCloseButton);
    menu_rulesTextScrollPane.setBounds(104, 104, 1160, 552);
    menu_rulesText.setLineWrap(true);
    menu_rulesText.setWrapStyleWord(true);
    menu_rulesText.setEditable(false);
    menu_rulesText.setText("Blackjack by Fynn Gerstenkorn\n-DISCLAIMER- I do not know everything about Blackjack, and I had to cut some corners to get it to work with my limited knowledge about Java. This version is not the standard Blackjack, it is my custom version with its own special rules.\n\nBlackjack is a game where you are given cards by the dealer and try to get as close to 21 without getting over it. Before the start, you place a bet, and if you want, you can also bet on the dealer going bust. Once you start the game, you are given two cards, and the dealer has two cards as well, one of which is hidden. You then have the choice to either hit, that means drawing another Card, or to stand, which means ending your “turn” and letting the dealer draw. If you get over 21, you go bust and loose your money. If you decide to stand, it is the dealers turn to draw cards. He can’t decide what he does tho, he has to hit until he has at least 17. If he goes bust, or he has more than 17 but you have more than him, you win.\n\nSpecial rules:\n- On your initial two cards, you have the option to double down. That means you double your bet and are only given one more card, after that it’s the dealers turn.\n- If you and the dealer tie, your bet is refunded.\n- If you go bust or have a Blackjack, your bet on the dealer going bust is refunded.\n- If you have over 21 but have an ace, your ace is counted as a 1 instead of 11. This only applies to one ace per round. The same goes for the dealer.\n- If you run out of money, you cannot take a loan from the casino, you have to restart the game.\n\nCard Values:\nAce: 11 or 1\n2: 2\n3: 3\n4: 4\n5: 5\n6: 6\n7: 7\n8: 8\n9: 9\n10: 10\nJack: 10\nQueen: 10\nKing: 10\n\nPayouts:\nNormal Win			–	200% of initial bet\nBust			–	Nothing (+ 100% of dealer bust bet)\nTie			–	100% of initial bet (+ 100% of dealer bust bet)\nBlackjack			–	250% of initial bet (+ 100% of dealer bust bet)\nDealer bust bet win		–	350% of dealer bust bet\nDealer bust bet loss		–	Nothing\n\nSources:\nCard Images - https://wszystkiesymbole.pl/kategorie-kart-klasycznych/karo/\nCard Backside - https://m.media-amazon.com/images/I/61+jpMbTLvL._AC_.jpg\nhttps://www.mobilebettingsite.com/blackjack-dealer-busts-probability-payout/\nhttps://www.blackjack-winner.de/blackjack-side-bets-zusatzwetten/\nhttps://www.pokernews.com/casino/blackjack-side-bets.htm\nhttps://www.telegraph.co.uk/betting/casino-guides/blackjack/double-down/\nhttps://www.islandresortandcasino.com/blog/ask-the-dealer-what-does-double-down-mean-in-blackjack\nhttps://www.spielregeln-spielanleitungen.de/gluecksspiel/wie-spielt-man-black-jack/\nhttps://www.telegraph.co.uk/betting/casino-guides/blackjack/split/\nhttps://outplayed.com/blackjack-strategy-calculator\nhttps://playingcarddecks.com/blogs/how-to-play/blackjack-game-rules");
    menu_rulesText.setFont(new Font("Dialog", Font.BOLD, 18));
    menu_rulesText.setMargin(new Insets(20,20,20,20));
    menu_rulesText.setTabSize(4);
    cp.add(menu_rulesTextScrollPane);
    menu_console.setBounds(488, 120, 392, 48);
    menu_console.setText("Console");
    menu_console.setHorizontalAlignment(SwingConstants.CENTER);
    menu_console.setOpaque(false);
    menu_console.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_console.setForeground(Color.WHITE);
    cp.add(menu_console);
    // menu_start components
    // menu_start components
    
    menu_bet.setBounds(432, 224, 160, 32);
    menu_bet.setText("0");
    menu_bet.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_bet);
    menu_start.setBounds(632, 360, 104, 40);
    menu_start.setText("Start");
    menu_start.setMargin(new Insets(2, 2, 2, 2));
    menu_start.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        menu_start_ActionPerformed(evt);
      }
    });
    menu_start.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(menu_start);
    cp.setBackground(new Color(0x177301));
    
    menu_dealerBustCheckBox.setBounds(776, 272, 144, 24);
    menu_dealerBustCheckBox.setText("Bet on Dealer Bust?");
    menu_dealerBustCheckBox.setOpaque(false);
    menu_dealerBustCheckBox.setBackground(Color.GREEN);
    menu_dealerBustCheckBox.setForeground(Color.WHITE);
    menu_dealerBustCheckBox.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(menu_dealerBustCheckBox);
    menu_dealerBustBet.setBounds(776, 224, 160, 32);
    menu_dealerBustBet.setText("0");
    menu_dealerBustBet.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_dealerBustBet);
    ingame_stand.setBounds(560, 560, 80, 36);
    ingame_stand.setText("Stand");
    ingame_stand.setMargin(new Insets(2, 2, 2, 2));
    ingame_stand.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        ingame_stand_ActionPerformed(evt);
      }
    });
    ingame_stand.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(ingame_stand);
    ingame_hit.setBounds(720, 560, 72, 36);
    ingame_hit.setText("Hit");
    ingame_hit.setMargin(new Insets(2, 2, 2, 2));
    ingame_hit.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        ingame_hit_ActionPerformed(evt);
      }
    });
    ingame_hit.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(ingame_hit);
    ingame_doubleDown.setBounds(944, 560, 136, 36);
    ingame_doubleDown.setText("Double Down");
    ingame_doubleDown.setMargin(new Insets(2, 2, 2, 2));
    ingame_doubleDown.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        ingame_doubleDown_ActionPerformed(evt);
      }
    });
    ingame_doubleDown.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(ingame_doubleDown);
    menu_betLabel.setBounds(496, 192, 40, 32);
    menu_betLabel.setText("Bet:");
    menu_betLabel.setBackground(Color.GREEN);
    menu_betLabel.setVisible(true);
    menu_betLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_betLabel.setForeground(Color.WHITE);
    cp.add(menu_betLabel);
    menu_dealerBustBetLabel.setBounds(776, 192, 159, 32);
    menu_dealerBustBetLabel.setText("Dealer Bust Bet:");
    menu_dealerBustBetLabel.setBackground(Color.GREEN);
    menu_dealerBustBetLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_dealerBustBetLabel.setForeground(Color.WHITE);
    cp.add(menu_dealerBustBetLabel);
    menu_balanceLabel.setBounds(16, 16, 88, 32);
    menu_balanceLabel.setText("Balance:");
    menu_balanceLabel.setBackground(Color.GREEN);
    menu_balanceLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_balanceLabel.setForeground(Color.WHITE);
    cp.add(menu_balanceLabel);
    menu_balance.setBounds(104, 16, 104, 32);
    menu_balance.setEditable(false);
    menu_balance.setText("1000");
    menu_balance.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_balance);
    ingame_bet.setBounds(16, 112, 296, 40);
    ingame_bet.setText("Bet: ");
    ingame_bet.setBackground(Color.GREEN);
    ingame_bet.setFont(new Font("Dialog", Font.BOLD, 20));
    ingame_bet.setForeground(Color.WHITE);
    cp.add(ingame_bet);
    ingame_console.setBounds(488, 120, 392, 48);
    ingame_console.setText("Console");
    ingame_console.setBackground(Color.GREEN);
    ingame_console.setFont(new Font("Dialog", Font.BOLD, 20));
    ingame_console.setForeground(Color.WHITE);
    ingame_console.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(ingame_console);
    ingame_balance.setBounds(16, 48, 192, 40);
    ingame_balance.setText("Balance: ");
    ingame_balance.setBackground(Color.GREEN);
    ingame_balance.setVisible(true);
    ingame_balance.setFont(new Font("Dialog", Font.BOLD, 20));
    ingame_balance.setForeground(Color.WHITE);
    cp.add(ingame_balance);
    menu_restart.setBounds(632, 184, 104, 40);
    menu_restart.setText("Restart?");
    menu_restart.setMargin(new Insets(2, 2, 2, 2));
    menu_restart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        menu_restart_ActionPerformed(evt);
      }
    });
    menu_restart.setVisible(true);
    menu_restart.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(menu_restart);
    ingame_userHand1.setBounds(288, 416, 72, 112);
    ingame_userHand1.setIcon(ingame_userHand1Icon);
    ingame_userHand1.setBackground(Color.GREEN);
    ingame_userHand1.setOpaque(false);
    cp.add(ingame_userHand1);
    ingame_userHand2.setBounds(368, 416, 72, 112);
    ingame_userHand2.setIcon(ingame_userHand2Icon);
    ingame_userHand2.setHorizontalTextPosition(SwingConstants.CENTER);
    ingame_userHand2.setBackground(Color.GREEN);
    cp.add(ingame_userHand2);
    ingame_userHand3.setBounds(448, 416, 72, 112);
    ingame_userHand3.setIcon(ingame_userHand3Icon);
    ingame_userHand3.setBackground(Color.GREEN);
    cp.add(ingame_userHand3);
    ingame_userHand4.setBounds(528, 416, 72, 112);
    ingame_userHand4.setIcon(ingame_userHand4Icon);
    ingame_userHand4.setBackground(Color.GREEN);
    cp.add(ingame_userHand4);
    ingame_userHand5.setBounds(608, 416, 72, 112);
    ingame_userHand5.setIcon(ingame_userHand5Icon);
    ingame_userHand5.setBackground(Color.GREEN);
    cp.add(ingame_userHand5);
    ingame_dealerHand2.setBounds(368, 232, 72, 112);
    ingame_dealerHand2.setIcon(ingame_dealerHand2Icon);
    ingame_dealerHand2.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand2);
    ingame_dealerHand3.setBounds(448, 232, 72, 112);
    ingame_dealerHand3.setIcon(ingame_dealerHand3Icon);
    ingame_dealerHand3.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand3);
    ingame_dealerHand4.setBounds(528, 232, 72, 112);
    ingame_dealerHand4.setIcon(ingame_dealerHand4Icon);
    ingame_dealerHand4.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand4);
    ingame_dealerHand5.setBounds(608, 232, 72, 112);
    ingame_dealerHand5.setIcon(ingame_dealerHand5Icon);
    ingame_dealerHand5.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand5);
    ingame_userHand6.setBounds(688, 416, 72, 112);
    ingame_userHand7.setBounds(768, 416, 72, 112);
    ingame_userHand8.setBounds(848, 416, 72, 112);
    ingame_userHand9.setBounds(928, 416, 72, 112);
    ingame_userHand10.setBounds(1008, 416, 72, 112);
    ingame_dealerHand6.setBounds(688, 232, 72, 112);
    ingame_dealerHand7.setBounds(768, 232, 72, 112);
    ingame_dealerHand8.setBounds(848, 232, 72, 112);
    ingame_dealerHand9.setBounds(928, 232, 72, 112);
    ingame_dealerHand10.setBounds(1008, 232, 72, 112);
    ingame_userHand6.setIcon(ingame_userHand6Icon);
    ingame_userHand6.setBackground(Color.GREEN);
    cp.add(ingame_userHand6);
    ingame_userHand7.setIcon(ingame_userHand7Icon);
    ingame_userHand7.setBackground(Color.GREEN);
    ingame_userHand7.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(ingame_userHand7);
    ingame_userHand8.setIcon(ingame_userHand8Icon);
    ingame_userHand8.setBackground(Color.GREEN);
    cp.add(ingame_userHand8);
    ingame_userHand9.setIcon(ingame_userHand9Icon);
    ingame_userHand9.setBackground(Color.GREEN);
    cp.add(ingame_userHand9);
    ingame_userHand10.setIcon(ingame_userHand10Icon);
    ingame_userHand10.setBackground(Color.GREEN);
    cp.add(ingame_userHand10);
    ingame_dealerHand6.setIcon(ingame_dealerHand6Icon);
    ingame_dealerHand6.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand6);
    ingame_dealerHand7.setIcon(ingame_dealerHand7Icon);
    ingame_dealerHand7.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand7);
    ingame_dealerHand8.setIcon(ingame_dealerHand8Icon);
    ingame_dealerHand8.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand8);
    ingame_dealerHand9.setIcon(ingame_dealerHand9Icon);
    ingame_dealerHand9.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand9);
    ingame_dealerHand10.setIcon(ingame_dealerHand10Icon);
    ingame_dealerHand10.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand10);
    ingame_dealerHand1.setBounds(288, 232, 72, 112);
    ingame_dealerHand1.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand1.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand1);
    ingame_dealerHand1Hider.setBounds(288, 232, 72, 112);
    ingame_dealerHand1Hider.setText("");
    ingame_dealerHand1Hider.setIcon(ingame_dealerHand1HiderIcon);
    ingame_dealerHand1Hider.setBackground(Color.GREEN);
    cp.add(ingame_dealerHand1Hider);
    ingame_finish.setBounds(640, 640, 80, 36);
    ingame_finish.setText("Finish");
    ingame_finish.setMargin(new Insets(2, 2, 2, 2));
    ingame_finish.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        ingame_finish_ActionPerformed(evt);
      }
    });
    ingame_finish.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(ingame_finish);
    ingame_dealerBustBet.setBounds(16, 152, 296, 40);
    ingame_dealerBustBet.setText("Dealer Bust Bet:");
    ingame_dealerBustBet.setBackground(Color.GREEN);
    ingame_dealerBustBet.setFont(new Font("Dialog", Font.BOLD, 20));
    ingame_dealerBustBet.setForeground(Color.WHITE);
    cp.add(ingame_dealerBustBet);
    menu_wins.setBounds(1280, 304, 80, 32);
    menu_wins.setEditable(false);
    menu_wins.setText("0");
    menu_wins.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_wins);
    menu_losses.setBounds(1280, 344, 80, 32);
    menu_losses.setEditable(false);
    menu_losses.setText("0");
    menu_losses.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_losses);
    menu_ties.setBounds(1280, 384, 80, 32);
    menu_ties.setEditable(false);
    menu_ties.setText("0");
    menu_ties.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_ties);
    menu_blackjacks.setBounds(1280, 424, 80, 32);
    menu_blackjacks.setEditable(false);
    menu_blackjacks.setText("0");
    menu_blackjacks.setFont(new Font("Dialog", Font.PLAIN, 20));
    cp.add(menu_blackjacks);
    menu_winsLabel.setBounds(1208, 304, 64, 28);
    menu_winsLabel.setText("Wins:");
    menu_winsLabel.setBackground(Color.GREEN);
    menu_winsLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_winsLabel.setForeground(Color.WHITE);
    cp.add(menu_winsLabel);
    cp.add(ingame_dealerHand1);
    cp.add(menu_bet);
    cp.add(menu_start);
    cp.add(menu_dealerBustCheckBox);
    cp.add(menu_dealerBustBet);
    cp.add(ingame_stand);
    cp.add(ingame_hit);
    cp.add(ingame_doubleDown);
    cp.add(menu_betLabel);
    cp.add(menu_dealerBustBetLabel);
    cp.add(menu_balanceLabel);
    cp.add(menu_balance);
    cp.add(menu_console);
    cp.add(ingame_bet);
    cp.add(ingame_console);
    cp.add(ingame_balance);
    cp.add(menu_restart);
    cp.add(ingame_userHand1);
    cp.add(ingame_userHand2);
    cp.add(ingame_userHand3);
    cp.add(ingame_userHand4);
    cp.add(ingame_userHand5);
    cp.add(ingame_dealerHand2);
    cp.add(ingame_dealerHand3);
    cp.add(ingame_dealerHand4);
    cp.add(ingame_dealerHand5);
    cp.add(ingame_userHand6);
    cp.add(ingame_userHand7);
    cp.add(ingame_userHand8);
    cp.add(ingame_userHand9);
    cp.add(ingame_userHand10);
    cp.add(ingame_dealerHand6);
    cp.add(ingame_dealerHand7);
    cp.add(ingame_dealerHand8);
    cp.add(ingame_dealerHand9);
    cp.add(ingame_dealerHand10);
    cp.add(ingame_dealerHand1Hider);
    cp.add(ingame_finish);
    cp.add(ingame_dealerBustBet);
    cp.add(menu_wins);
    cp.add(menu_losses);
    cp.add(menu_ties);
    cp.add(menu_blackjacks);
    cp.add(menu_winsLabel);
    menu_lossesLabel.setBounds(1192, 344, 79, 28);
    menu_lossesLabel.setText("Losses:");
    menu_lossesLabel.setBackground(Color.GREEN);
    menu_lossesLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_lossesLabel.setForeground(Color.WHITE);
    cp.add(menu_lossesLabel);
    menu_tiesLabel.setBounds(1216, 384, 56, 28);
    menu_tiesLabel.setText("Ties:");
    menu_tiesLabel.setBackground(Color.GREEN);
    menu_tiesLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_tiesLabel.setForeground(Color.WHITE);
    cp.add(menu_tiesLabel);
    menu_blackjacksLabel.setBounds(1160, 424, 112, 32);
    menu_blackjacksLabel.setText("Blackjacks:");
    menu_blackjacksLabel.setBackground(Color.GREEN);
    menu_blackjacksLabel.setFont(new Font("Dialog", Font.BOLD, 20));
    menu_blackjacksLabel.setForeground(Color.WHITE);
    cp.add(menu_blackjacksLabel);
    menu_rulesButton.setBounds(1272, 16, 72, 40);
    menu_rulesButton.setText("Rules");
    menu_rulesButton.setMargin(new Insets(2, 2, 2, 2));
    menu_rulesButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        menu_rulesButton_ActionPerformed(evt);
      }
    });
    menu_rulesButton.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(menu_rulesButton);
    backgroundLabel.setBounds(-32, 0, 1400, 760);
    backgroundLabel.setText("");
    backgroundLabel.setBackground(Color.CYAN);
    backgroundLabel.setIcon(backgroundLabelIcon);
    backgroundLabel.setFocusable(true);
    backgroundLabel.setEnabled(true);
    cp.add(backgroundLabel);

    // end components
    setVisible(true);
    
    // OWN STUFF
    ingame_console.setVisible(false);                                                                                                           // Makes the ingame-items invisible
    ingame_bet.setVisible(false);
    ingame_userHandLabel.setVisible(false);
    ingame_dealerHandLabel.setVisible(false);
    ingame_stand.setVisible(false);
    ingame_hit.setVisible(false);
    ingame_doubleDown.setVisible(false);
    ingame_balance.setVisible(false);
    ingame_userHand1.setVisible(false);
    ingame_userHand2.setVisible(false);
    ingame_userHand3.setVisible(false);
    ingame_userHand4.setVisible(false);
    ingame_userHand5.setVisible(false);
    ingame_userHand6.setVisible(false);
    ingame_userHand7.setVisible(false);
    ingame_userHand8.setVisible(false);
    ingame_userHand9.setVisible(false);
    ingame_userHand10.setVisible(false);
    ingame_dealerHand1Hider.setVisible(false);
    ingame_dealerHand1.setVisible(false);
    ingame_dealerHand2.setVisible(false);
    ingame_dealerHand3.setVisible(false);
    ingame_dealerHand4.setVisible(false);
    ingame_dealerHand5.setVisible(false);
    ingame_dealerHand6.setVisible(false);
    ingame_dealerHand7.setVisible(false);
    ingame_dealerHand8.setVisible(false);
    ingame_dealerHand9.setVisible(false);
    ingame_dealerHand10.setVisible(false);
    ingame_dealerBustBet.setVisible(false);
    ingame_finish.setVisible(false);
    menu_restart.setVisible(false);
    menu_rulesText.setVisible(false);
    menu_rulesCloseButton.setVisible(false);
    menu_rulesTextScrollPane.setVisible(false);
  } // end of public Blackjack
  
  // start methods
  
  public static void main(String[] args) {
    new Blackjack();
  } // end of main
  
  public void menu_start_ActionPerformed(ActionEvent evt) {
    if (menu_balance.getDouble() <= 0) {                                                                                       
      menu_console.setText("You are out of Money");
      menu_restart.setVisible(true);
      return;
    }
    if (menu_bet.getDouble() > menu_balance.getDouble() && menu_bet.getDouble() != 42069) {                                                                      
      menu_console.setText("You do not have enough Money");
      return;
    }
    if (menu_bet.getDouble() <= 0) {                                                                                           
      menu_console.setText("You have to place a bet");
      return;
    }
    if (menu_dealerBustCheckBox.isSelected()) {                                                                                
      if (menu_dealerBustBet.getDouble() <= 0) {
        menu_console.setText("You have to place a seperate bet for Dealer Bust");                                                               
        return;
      }
      if (menu_dealerBustBet.getDouble() + menu_bet.getDouble() > menu_balance.getDouble() && menu_bet.getDouble() != 42069) {                                 
        menu_console.setText("You do not have enough Money");
        return;
      }
    }
    if (menu_bet.getDouble() == 42069) {
      menu_balance.setDouble(menu_balance.getDouble() + 42069);
    }
    menu_start.setVisible(false);                                                                                                            //if everything is correct, the menu-items are hidden and the ingame-items are made visible
    menu_bet.setVisible(false);                                                                                        
    menu_betLabel.setVisible(false);                                                                                   
    menu_dealerBustCheckBox.setVisible(false);                                                                         
    menu_dealerBustBet.setVisible(false);
    menu_dealerBustBetLabel.setVisible(false);                                                                        
    menu_console.setVisible(false);
    menu_balance.setVisible(false);
    menu_balanceLabel.setVisible(false);
    menu_wins.setVisible(false);
    menu_losses.setVisible(false);
    menu_ties.setVisible(false);
    menu_blackjacks.setVisible(false);
    menu_winsLabel.setVisible(false);
    menu_lossesLabel.setVisible(false);
    menu_tiesLabel.setVisible(false);
    menu_blackjacksLabel.setVisible(false);
    menu_rulesButton.setVisible(false);                                                                               
    ingame_console.setVisible(true);
    ingame_bet.setVisible(true);
    ingame_userHandLabel.setVisible(true);
    ingame_dealerHandLabel.setVisible(true);                                                                               
    ingame_stand.setVisible(true);
    ingame_hit.setVisible(true);
    ingame_doubleDown.setVisible(true);                                                                                
    ingame_balance.setVisible(true);
    ingame_userHand1.setVisible(true);
    ingame_userHand2.setVisible(true);
    ingame_userHand3.setVisible(true);
    ingame_userHand4.setVisible(true);
    ingame_userHand5.setVisible(true);
    ingame_userHand6.setVisible(true);
    ingame_userHand7.setVisible(true);
    ingame_userHand8.setVisible(true);
    ingame_userHand9.setVisible(true);
    ingame_userHand10.setVisible(true);
    ingame_dealerHand1Hider.setVisible(true);
    ingame_dealerHand2.setVisible(true);
    ingame_dealerHand3.setVisible(true);
    ingame_dealerHand4.setVisible(true);
    ingame_dealerHand5.setVisible(true);
    ingame_dealerHand6.setVisible(true);
    ingame_dealerHand7.setVisible(true);
    ingame_dealerHand8.setVisible(true);
    ingame_dealerHand9.setVisible(true);
    ingame_dealerHand10.setVisible(true);
    menu_console.setText("Console");
    
    menu_balance.setDouble(menu_balance.getDouble() - menu_bet.getDouble());                                                                  
    if (menu_dealerBustCheckBox.isSelected()) {
      menu_balance.setDouble(menu_balance.getDouble() - menu_dealerBustBet.getDouble());
      ingame_dealerBustBet.setVisible(true);
      ingame_dealerBustBet.setText("Dealer Bust Bet: " + Double.toString(menu_dealerBustBet.getDouble()));
    }
    ingame_bet.setText("Bet: " + Double.toString(menu_bet.getDouble()));                                                                      
    ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
    
    Random randomizer = new Random();
    int temp = randomizer.nextInt(12);
    if (temp == 0) {
      ingame_userHand1.setIcon(new ImageIcon("images/Ace.png"));
      userHandTotal = userHandTotal + 11;
      uAce = true;
    } else if (temp == 1) {
      ingame_userHand1.setIcon(new ImageIcon("images/2.png"));
      userHandTotal = userHandTotal + 2;
    } else if (temp == 2) {
      ingame_userHand1.setIcon(new ImageIcon("images/3.png"));
      userHandTotal = userHandTotal + 3;
    } else if (temp == 3) {
      ingame_userHand1.setIcon(new ImageIcon("images/4.png"));
      userHandTotal = userHandTotal + 4;
    } else if (temp == 4) {
      ingame_userHand1.setIcon(new ImageIcon("images/5.png"));
      userHandTotal = userHandTotal + 5;
    } else if (temp == 5) {
      ingame_userHand1.setIcon(new ImageIcon("images/6.png"));
      userHandTotal = userHandTotal + 6;
    } else if (temp == 6) {
      ingame_userHand1.setIcon(new ImageIcon("images/7.png"));
      userHandTotal = userHandTotal + 7;
    } else if (temp == 7) {
      ingame_userHand1.setIcon(new ImageIcon("images/8.png"));
      userHandTotal = userHandTotal + 8;
    } else if (temp == 8) {
      ingame_userHand1.setIcon(new ImageIcon("images/9.png"));
      userHandTotal = userHandTotal + 9;
    } else if (temp == 9) {
      ingame_userHand1.setIcon(new ImageIcon("images/10.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 10) {
      ingame_userHand1.setIcon(new ImageIcon("images/Jack.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 11) {
      ingame_userHand1.setIcon(new ImageIcon("images/Queen.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 12) {
      ingame_userHand1.setIcon(new ImageIcon("images/King.png"));
      userHandTotal = userHandTotal + 10;
    }
    temp = randomizer.nextInt(12);
    if (temp == 0) {
      ingame_userHand2.setIcon(new ImageIcon("images/Ace.png"));
      userHandTotal = userHandTotal + 11;
      uAce = true;
    } else if (temp == 1) {
      ingame_userHand2.setIcon(new ImageIcon("images/2.png"));
      userHandTotal = userHandTotal + 2;
    } else if (temp == 2) {
      ingame_userHand2.setIcon(new ImageIcon("images/3.png"));
      userHandTotal = userHandTotal + 3;
    } else if (temp == 3) {
      ingame_userHand2.setIcon(new ImageIcon("images/4.png"));
      userHandTotal = userHandTotal + 4;
    } else if (temp == 4) {
      ingame_userHand2.setIcon(new ImageIcon("images/5.png"));
      userHandTotal = userHandTotal + 5;
    } else if (temp == 5) {
      ingame_userHand2.setIcon(new ImageIcon("images/6.png"));
      userHandTotal = userHandTotal + 6;
    } else if (temp == 6) {
      ingame_userHand2.setIcon(new ImageIcon("images/7.png"));
      userHandTotal = userHandTotal + 7;
    } else if (temp == 7) {
      ingame_userHand2.setIcon(new ImageIcon("images/8.png"));
      userHandTotal = userHandTotal + 8;
    } else if (temp == 8) {
      ingame_userHand2.setIcon(new ImageIcon("images/9.png"));
      userHandTotal = userHandTotal + 9;
    } else if (temp == 9) {
      ingame_userHand2.setIcon(new ImageIcon("images/10.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 10) {
      ingame_userHand2.setIcon(new ImageIcon("images/Jack.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 11) {
      ingame_userHand2.setIcon(new ImageIcon("images/Queen.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 12) {
      ingame_userHand2.setIcon(new ImageIcon("images/King.png"));
      userHandTotal = userHandTotal + 10;
    }
    
    temp = randomizer.nextInt(12);
    if (temp == 0) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/Ace.png"));
      dealerHandTotal = dealerHandTotal + 11;
      dAce = true;
    } else if (temp == 1) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/2.png"));
      dealerHandTotal = dealerHandTotal + 2;
    } else if (temp == 2) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/3.png"));
      dealerHandTotal = dealerHandTotal + 3;
    } else if (temp == 3) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/4.png"));
      dealerHandTotal = dealerHandTotal + 4;
    } else if (temp == 4) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/5.png"));
      dealerHandTotal = dealerHandTotal + 5;
    } else if (temp == 5) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/6.png"));
      dealerHandTotal = dealerHandTotal + 6;
    } else if (temp == 6) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/7.png"));
      dealerHandTotal = dealerHandTotal + 7;
    } else if (temp == 7) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/8.png"));
      dealerHandTotal = dealerHandTotal + 8;
    } else if (temp == 8) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/9.png"));
      dealerHandTotal = dealerHandTotal + 9;
    } else if (temp == 9) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/10.png"));
      dealerHandTotal = dealerHandTotal + 10;
    } else if (temp == 10) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/Jack.png"));
      dealerHandTotal = dealerHandTotal + 10;
    } else if (temp == 11) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/Queen.png"));
      dealerHandTotal = dealerHandTotal + 10;
    } else if (temp == 12) {
      ingame_dealerHand1.setIcon(new ImageIcon("images/King.png"));
      dealerHandTotal = dealerHandTotal + 10;
    }
    temp = randomizer.nextInt(12);
    if (temp == 0) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/Ace.png"));
      dealerHandTotal = dealerHandTotal + 11;
      dAce = true;
    } else if (temp == 1) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/2.png"));
      dealerHandTotal = dealerHandTotal + 2;
    } else if (temp == 2) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/3.png"));
      dealerHandTotal = dealerHandTotal + 3;
    } else if (temp == 3) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/4.png"));
      dealerHandTotal = dealerHandTotal + 4;
    } else if (temp == 4) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/5.png"));
      dealerHandTotal = dealerHandTotal + 5;
    } else if (temp == 5) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/6.png"));
      dealerHandTotal = dealerHandTotal + 6;
    } else if (temp == 6) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/7.png"));
      dealerHandTotal = dealerHandTotal + 7;
    } else if (temp == 7) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/8.png"));
      dealerHandTotal = dealerHandTotal + 8;
    } else if (temp == 8) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/9.png"));
      dealerHandTotal = dealerHandTotal + 9;
    } else if (temp == 9) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/10.png"));
      dealerHandTotal = dealerHandTotal + 10;
    } else if (temp == 10) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/Jack.png"));
      dealerHandTotal = dealerHandTotal + 10;
    } else if (temp == 11) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/Queen.png"));
      dealerHandTotal = dealerHandTotal + 10;
    } else if (temp == 12) {
      ingame_dealerHand2.setIcon(new ImageIcon("images/King.png"));
      dealerHandTotal = dealerHandTotal + 10;
    }
    
    if (userHandTotal == 21 && dealerHandTotal != 21) {
      ingame_console.setText("Black Jack!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble() * 2.5);
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_blackjacks.setInt(menu_blackjacks.getInt() + 1);
      return;  
    } else if (userHandTotal == 21 && dealerHandTotal == 21) {
      ingame_console.setText("Tie!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble());
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_ties.setInt(menu_ties.getInt() + 1);
      return;
    }
    if (userHandTotal == 22) {
      userHandTotal = userHandTotal - 10;
      uAceBust = true;
      ingame_console.setText("One Ace now counts as 1 instead of 11");
    }
    if (dealerHandTotal == 22) {
      userHandTotal = userHandTotal - 10;
      dAceBust = true;
    }
  }
  
  public void menu_restart_ActionPerformed(ActionEvent evt) {
    menu_restart.setVisible(false);
    menu_console.setText("Console");
    menu_balance.setInt(1000);
    menu_bet.setInt(0);
    menu_dealerBustBet.setInt(0);
    menu_dealerBustCheckBox.setSelected(false);
    menu_wins.setInt(0);
    menu_losses.setInt(0);
    menu_ties.setInt(0);
    menu_blackjacks.setInt(0);
  }
  
  public void ingame_stand_ActionPerformed(ActionEvent evt) {
    ingame_dealerHand1Hider.setVisible(false);
    ingame_dealerHand1.setVisible(true);
    if (dealerHandTotal == 21) {
      ingame_console.setText("Dealer has a Black Jack!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
    } else if (dealerHandTotal == 22) {
      dAceBust = true;
      dealerHandTotal = 12;   
    }
    while(dealerHandTotal < 17) {
      Random randomizer = new Random();
      int temp = randomizer.nextInt(12);
      if (dround == 3) {
        if (temp == 0) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand3.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 4) {
        if (temp == 0) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand4.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 5) {
        if (temp == 0) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand5.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 6) {
        if (temp == 0) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand6.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 7) {
        if (temp == 0) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand7.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 8) {
        if (temp == 0) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand8.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 9) {
        if (temp == 0) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand9.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      if (dround == 10) {
        if (temp == 0) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/Ace.png"));
          dealerHandTotal = dealerHandTotal + 11;
          dAce = true;
        } else if (temp == 1) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/2.png"));
          dealerHandTotal = dealerHandTotal + 2;
        } else if (temp == 2) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/3.png"));
          dealerHandTotal = dealerHandTotal + 3;
        } else if (temp == 3) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/4.png"));
          dealerHandTotal = dealerHandTotal + 4;
        } else if (temp == 4) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/5.png"));
          dealerHandTotal = dealerHandTotal + 5;
        } else if (temp == 5) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/6.png"));
          dealerHandTotal = dealerHandTotal + 6;
        } else if (temp == 6) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/7.png"));
          dealerHandTotal = dealerHandTotal + 7;
        } else if (temp == 7) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/8.png"));
          dealerHandTotal = dealerHandTotal + 8;
        } else if (temp == 8) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/9.png"));
          dealerHandTotal = dealerHandTotal + 9;
        } else if (temp == 9) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/10.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 10) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/Jack.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 11) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/Queen.png"));
          dealerHandTotal = dealerHandTotal + 10;
        } else if (temp == 12) {
          ingame_dealerHand10.setIcon(new ImageIcon("images/King.png"));
          dealerHandTotal = dealerHandTotal + 10;
        }
      }
      
      if (dealerHandTotal > 21 && dAce == true && dAceBust == false) {
        dealerHandTotal = dealerHandTotal - 10;
        dAceBust = true;
      }
      dround++;
    }
    if (dealerHandTotal > 21) {
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      ingame_console.setText("Dealer went Bust!");
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble() * 2);
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_wins.setInt(menu_wins.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble() * 3.5);
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }
      return;
    } else if (dealerHandTotal > userHandTotal) {
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      ingame_console.setText("Dealer Wins!");
      menu_losses.setInt(menu_losses.getInt() + 1);
      return;
    } else if (userHandTotal > dealerHandTotal) {
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      ingame_console.setText("You Win!");
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble() * 2);
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_wins.setInt(menu_wins.getInt() + 1);
      return;  
    } else if (userHandTotal == dealerHandTotal) {
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      ingame_console.setText("Tie!");
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble());
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_ties.setInt(menu_ties.getInt() + 1);
      return;  
    }
  }
  
  public void ingame_hit_ActionPerformed(ActionEvent evt) {
    ingame_doubleDown.setVisible(false);
    Random randomizer = new Random();
    int temp = randomizer.nextInt(12);
    if (round == 3) {
      if (temp == 0) {
        ingame_userHand3.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand3.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand3.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand3.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand3.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand3.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand3.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand3.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand3.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand3.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand3.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand3.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand3.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 4) {
      if (temp == 0) {
        ingame_userHand4.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand4.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand4.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand4.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand4.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand4.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand4.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand4.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand4.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand4.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand4.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand4.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand4.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 5) {
      if (temp == 0) {
        ingame_userHand5.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand5.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand5.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand5.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand5.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand5.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand5.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand5.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand5.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand5.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand5.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand5.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand5.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 6) {
      if (temp == 0) {
        ingame_userHand6.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand6.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand6.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand6.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand6.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand6.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand6.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand6.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand6.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand6.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand6.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand6.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand6.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 7) {
      if (temp == 0) {
        ingame_userHand7.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand7.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand7.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand7.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand7.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand7.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand7.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand7.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand7.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand7.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand7.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand7.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand7.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 8) {
      if (temp == 0) {
        ingame_userHand8.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand8.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand8.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand8.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand8.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand8.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand8.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand8.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand8.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand8.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand8.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand8.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand8.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 9) {
      if (temp == 0) {
        ingame_userHand9.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand9.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand9.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand9.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand9.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand9.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand9.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand9.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand9.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand9.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand9.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand9.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand9.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    if (round == 10) {
      if (temp == 0) {
        ingame_userHand10.setIcon(new ImageIcon("images/Ace.png"));
        userHandTotal = userHandTotal + 11;
        uAce = true;
      } else if (temp == 1) {
        ingame_userHand10.setIcon(new ImageIcon("images/2.png"));
        userHandTotal = userHandTotal + 2;
      } else if (temp == 2) {
        ingame_userHand10.setIcon(new ImageIcon("images/3.png"));
        userHandTotal = userHandTotal + 3;
      } else if (temp == 3) {
        ingame_userHand10.setIcon(new ImageIcon("images/4.png"));
        userHandTotal = userHandTotal + 4;
      } else if (temp == 4) {
        ingame_userHand10.setIcon(new ImageIcon("images/5.png"));
        userHandTotal = userHandTotal + 5;
      } else if (temp == 5) {
        ingame_userHand10.setIcon(new ImageIcon("images/6.png"));
        userHandTotal = userHandTotal + 6;
      } else if (temp == 6) {
        ingame_userHand10.setIcon(new ImageIcon("images/7.png"));
        userHandTotal = userHandTotal + 7;
      } else if (temp == 7) {
        ingame_userHand10.setIcon(new ImageIcon("images/8.png"));
        userHandTotal = userHandTotal + 8;
      } else if (temp == 8) {
        ingame_userHand10.setIcon(new ImageIcon("images/9.png"));
        userHandTotal = userHandTotal + 9;
      } else if (temp == 9) {
        ingame_userHand10.setIcon(new ImageIcon("images/10.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 10) {
        ingame_userHand10.setIcon(new ImageIcon("images/Jack.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 11) {
        ingame_userHand10.setIcon(new ImageIcon("images/Queen.png"));
        userHandTotal = userHandTotal + 10;
      } else if (temp == 12) {
        ingame_userHand10.setIcon(new ImageIcon("images/King.png"));
        userHandTotal = userHandTotal + 10;
      }
    }
    
    if (userHandTotal > 21 && uAce == true && uAceBust == false) {
      ingame_console.setText("One Ace now counts as 1 instead of 11");
      userHandTotal = userHandTotal - 10;
      uAceBust = true;
    } else if (userHandTotal > 21) {
      ingame_console.setText("Bust!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_losses.setInt(menu_losses.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble());
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }  
    }
    if (userHandTotal == 21 && dealerHandTotal != 21) {
      ingame_console.setText("Black Jack!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble() * 2.5);
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_blackjacks.setInt(menu_blackjacks.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble());
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }
      return;  
    } else if (userHandTotal == 21 && dealerHandTotal == 21) {
      ingame_console.setText("Tie!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble());
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_ties.setInt(menu_ties.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble());
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }
      return;
    }
    round++;
  } 
    
  public void ingame_doubleDown_ActionPerformed(ActionEvent evt) {
    if (menu_bet.getDouble() > menu_balance.getDouble()) {
      ingame_console.setText("You don't have enough Money");
      return;
    }
    ingame_bet.setText("Bet: " + Double.toString(menu_bet.getDouble() * 2));
    menu_balance.setDouble(menu_balance.getDouble() - menu_bet.getDouble());
    ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
    
    Random randomizer = new Random();
    int temp = randomizer.nextInt(12);
    if (temp == 0) {
      ingame_userHand3.setIcon(new ImageIcon("images/Ace.png"));
      userHandTotal = userHandTotal + 11;
      uAce = true;
    } else if (temp == 1) {
      ingame_userHand3.setIcon(new ImageIcon("images/2.png"));
      userHandTotal = userHandTotal + 2;
    } else if (temp == 2) {
      ingame_userHand3.setIcon(new ImageIcon("images/3.png"));
      userHandTotal = userHandTotal + 3;
    } else if (temp == 3) {
      ingame_userHand3.setIcon(new ImageIcon("images/4.png"));
      userHandTotal = userHandTotal + 4;
    } else if (temp == 4) {
      ingame_userHand3.setIcon(new ImageIcon("images/5.png"));
      userHandTotal = userHandTotal + 5;
    } else if (temp == 5) {
      ingame_userHand3.setIcon(new ImageIcon("images/6.png"));
      userHandTotal = userHandTotal + 6;
    } else if (temp == 6) {
      ingame_userHand3.setIcon(new ImageIcon("images/7.png"));
      userHandTotal = userHandTotal + 7;
    } else if (temp == 7) {
      ingame_userHand3.setIcon(new ImageIcon("images/8.png"));
      userHandTotal = userHandTotal + 8;
    } else if (temp == 8) {
      ingame_userHand3.setIcon(new ImageIcon("images/9.png"));
      userHandTotal = userHandTotal + 9;
    } else if (temp == 9) {
      ingame_userHand3.setIcon(new ImageIcon("images/10.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 10) {
      ingame_userHand3.setIcon(new ImageIcon("images/Jack.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 11) {
      ingame_userHand3.setIcon(new ImageIcon("images/Queen.png"));
      userHandTotal = userHandTotal + 10;
    } else if (temp == 12) {
      ingame_userHand3.setIcon(new ImageIcon("images/King.png"));
      userHandTotal = userHandTotal + 10;
    }
    
    if (userHandTotal > 21 && uAce == true && uAceBust == false) {
      ingame_console.setText("One Ace now counts as 1 instead of 11");
      userHandTotal = userHandTotal - 10;
      uAceBust = true;
    } else if (userHandTotal > 21) {
      ingame_console.setText("Bust!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_losses.setInt(menu_losses.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble());
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }
      return;  
    }
    if (userHandTotal == 21 && dealerHandTotal != 21) {
      ingame_console.setText("Black Jack!");
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble() * 5);
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_blackjacks.setInt(menu_blackjacks.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble());
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }
      return;  
    } else if (userHandTotal == 21 && dealerHandTotal == 21) {
      ingame_console.setText("Tie!");
      ingame_dealerHand1Hider.setVisible(false);
      ingame_stand.setVisible(false);
      ingame_hit.setVisible(false);
      ingame_doubleDown.setVisible(false);
      ingame_finish.setVisible(true);
      menu_balance.setDouble(menu_balance.getDouble() + menu_bet.getDouble() * 2);
      ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      menu_ties.setInt(menu_ties.getInt() + 1);
      if (menu_dealerBustCheckBox.isSelected()) {
        menu_balance.setDouble(menu_balance.getDouble() + menu_dealerBustBet.getDouble());
        ingame_balance.setText("Balance: " + Double.toString(menu_balance.getDouble()));
      }
      return;
    }
    ingame_stand_ActionPerformed(evt);
  }
  
  public void ingame_finish_ActionPerformed(ActionEvent evt) {
    ingame_console.setVisible(false);                                                                                                           
    ingame_bet.setVisible(false);
    ingame_stand.setVisible(false);
    ingame_hit.setVisible(false);
    ingame_doubleDown.setVisible(false);
    ingame_balance.setVisible(false);
    ingame_dealerBustBet.setVisible(false);
    ingame_userHand1.setVisible(false);
    ingame_userHand2.setVisible(false);
    ingame_userHand3.setVisible(false);
    ingame_userHand4.setVisible(false);
    ingame_userHand5.setVisible(false);
    ingame_userHand6.setVisible(false);
    ingame_userHand7.setVisible(false);
    ingame_userHand8.setVisible(false);
    ingame_userHand9.setVisible(false);
    ingame_userHand10.setVisible(false);
    ingame_dealerHand1Hider.setVisible(false);
    ingame_dealerHand1.setVisible(false);
    ingame_dealerHand2.setVisible(false);
    ingame_dealerHand3.setVisible(false);
    ingame_dealerHand4.setVisible(false);
    ingame_dealerHand5.setVisible(false);
    ingame_dealerHand6.setVisible(false);
    ingame_dealerHand7.setVisible(false);
    ingame_dealerHand8.setVisible(false);
    ingame_dealerHand9.setVisible(false);
    ingame_dealerHand10.setVisible(false);
    ingame_finish.setVisible(false);
    menu_start.setVisible(true);                                                                                      
    menu_bet.setVisible(true);                                                                                        
    menu_betLabel.setVisible(true);                                                                                   
    menu_dealerBustCheckBox.setVisible(true);                                                                         
    menu_dealerBustBet.setVisible(true);
    menu_dealerBustBetLabel.setVisible(true);                                                                        
    menu_console.setVisible(true);
    menu_balance.setVisible(true);
    menu_balanceLabel.setVisible(true);
    menu_wins.setVisible(true);
    menu_losses.setVisible(true);
    menu_ties.setVisible(true);
    menu_blackjacks.setVisible(true);
    menu_winsLabel.setVisible(true);
    menu_lossesLabel.setVisible(true);
    menu_tiesLabel.setVisible(true);
    menu_blackjacksLabel.setVisible(true);
    menu_rulesButton.setVisible(true);
    
    ingame_userHand1.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand2.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand3.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand4.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand5.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand6.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand7.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand8.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand9.setIcon(new ImageIcon("images/back.png"));
    ingame_userHand10.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand1.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand2.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand3.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand4.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand5.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand6.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand7.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand8.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand9.setIcon(new ImageIcon("images/back.png"));
    ingame_dealerHand10.setIcon(new ImageIcon("images/back.png"));
    ingame_console.setText("Console");
    round = 3;
    dround = 3;
    userHandTotal = 0;
    dealerHandTotal = 0;
    uAce = false;
    dAce = false;
    uAceBust = false;
    dAceBust = false;
  }

  public void menu_rulesButton_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    menu_rulesText.setVisible(true);
    menu_rulesTextScrollPane.setVisible(true);
    menu_rulesCloseButton.setVisible(true);
    menu_start.setVisible(false);                                                                                      
    menu_bet.setVisible(false);                                                                                        
    menu_betLabel.setVisible(false);                                                                                   
    menu_dealerBustCheckBox.setVisible(false);                                                                         
    menu_dealerBustBet.setVisible(false);
    menu_dealerBustBetLabel.setVisible(false);                                                                        
    menu_console.setVisible(false);
    menu_balance.setVisible(false);
    menu_balanceLabel.setVisible(false);
    menu_wins.setVisible(false);
    menu_losses.setVisible(false);
    menu_ties.setVisible(false);
    menu_blackjacks.setVisible(false);
    menu_winsLabel.setVisible(false);
    menu_lossesLabel.setVisible(false);
    menu_tiesLabel.setVisible(false);
    menu_blackjacksLabel.setVisible(false);
    menu_rulesButton.setVisible(false);
  } // end of menu_rulesButton_ActionPerformed

  public void menu_rulesCloseButton_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    menu_rulesText.setVisible(false);
    menu_rulesTextScrollPane.setVisible(false);
    menu_rulesCloseButton.setVisible(false);
    menu_start.setVisible(true);                                                                                      
    menu_bet.setVisible(true);                                                                                        
    menu_betLabel.setVisible(true);                                                                                   
    menu_dealerBustCheckBox.setVisible(true);                                                                         
    menu_dealerBustBet.setVisible(true);
    menu_dealerBustBetLabel.setVisible(true);                                                                        
    menu_console.setVisible(true);
    menu_balance.setVisible(true);
    menu_balanceLabel.setVisible(true);
    menu_wins.setVisible(true);
    menu_losses.setVisible(true);
    menu_ties.setVisible(true);
    menu_blackjacks.setVisible(true);
    menu_winsLabel.setVisible(true);
    menu_lossesLabel.setVisible(true);
    menu_tiesLabel.setVisible(true);
    menu_blackjacksLabel.setVisible(true);
    menu_rulesButton.setVisible(true);
  } // end of menu_rulesCloseButton_ActionPerformed



  // end methods
} // end of class Blackjack
