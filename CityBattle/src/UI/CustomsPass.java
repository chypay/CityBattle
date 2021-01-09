package UI;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import edu.nwpu.citybattle.IngameElements.AiTank;
import edu.nwpu.citybattle.IngameElements.AiTankArray;
import edu.nwpu.citybattle.IngameElements.Bullet;
import edu.nwpu.citybattle.IngameElements.MyTank;
import edu.nwpu.citybattle.IngameElements.Tank;
import edu.nwpu.citybattle.TankMap.Map;
import edu.nwpu.citybattle.TankMap.Map1;
import edu.nwpu.citybattle.alogrism.BulletAlogrism;
import edu.nwpu.citybattle.alogrism.CronJob;
import edu.nwpu.citybattle.alogrism.CronJobSet;
import edu.nwpu.citybattle.alogrism.ThreadCronJob;
import edu.nwpu.citybattle.painter.DrawAll;
import edu.nwpu.citybattle.painter.ShapePainterbeiyong;

import java.awt.event.KeyEvent;
/**
 * @author 琚翔
 * version V1.0
 */
public class CustomsPass extends JFrame {

	public static JPanel contentPane;
	private static DrawAll draw;
	Graphics g2d = this.getGraphics();
	private static CustomsPass customspass;
	public static int winFlag;
	{
		winFlag = 0;
		
		
	}
	public static MyTank myTank;
	//Bullet bullet;
	JLabel background;
	JLabel wall;
	JLabel water;
	JLabel ironWall;
	JLabel grass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomsPass frame = new CustomsPass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomsPass() {
		super("坦克大战");
		setResizable(false);
		
		setBackground(new Color(0, 0, 0));
		//bullet = new Bullet(0,20,2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();//鑾峰緱灞忓箷灏哄
		int width = 1000;
		int height = 600;//璁剧疆绐楀彛瀹藉害鍜岄珮搴�
		setBounds((d.width-width)/2, (d.height-height)/2, width, height);//绐楀彛鐨勫潗鏍囧拰灏哄锛屼互姝ょ鏂瑰紡灞呬腑
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * 总分数
		 */
		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setText(Int.valueOf(mapNumber));
		lblNewLabel.setText(""+winFlag);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setBounds(880, 305, 108, 74);
		contentPane.add(lblNewLabel);
		/**
		 * 第几关
		 */
		JLabel lblNewLabel1 = new JLabel("");
//		lblNewLabel.setText(Int.valueOf(mapNumber));
		lblNewLabel1.setText(""+Choice.mapNumber);
		lblNewLabel1.setFont(new Font("宋体", Font.BOLD, 77));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setForeground(new Color(0, 255, 255));
		lblNewLabel1.setBounds(830, 0, 108, 74);
		contentPane.add(lblNewLabel1);
		
		ImageIcon icon_JLabel_B = new ImageIcon("img\\Right.png");
		JLabel lblNewLabel_B  = new JLabel(icon_JLabel_B);
		lblNewLabel_B.setBounds(785, 5, 200, 600);
		icon_JLabel_B.setImage(icon_JLabel_B.getImage().getScaledInstance(200, 600, 0));
		contentPane.add(lblNewLabel_B);
		lblNewLabel_B.setIcon(icon_JLabel_B);

		
		Map.selectMap();
		this.choice();
		customspass = this;
		myTank = new MyTank();
		draw = new DrawAll(myTank,contentPane);
		CronJobSet.addJob(new CronJob() {
	 			public void run() {
	 				//contentPane.removeAll();
	 				//contentPane.invalidate();
	 				draw.drawShape();
	 				//System.out.println(myTank.direction +" " + myTank.tank_x +  " num:" + myTank.tank_y );
	 				lblNewLabel.setText(""+winFlag);
	 				lblNewLabel.setFont(new Font("宋体", Font.BOLD, 50));
	 				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	 				lblNewLabel.setForeground(new Color(0, 255, 255));
	 				lblNewLabel.setBounds(880, 305, 108, 74);
	 				contentPane.updateUI();
	 			}
		}, 1);
		//contentPane.repaint();
		BulletAlogrism.initAlogrism(Map.wall, Map.ironwall, AiTankArray.aiTank, myTank);
		CronJobSet.startCronJob();
		ThreadCronJob.start();
	 	bindKey();
	}
	
	private void bindKey(){
		//缂佹垵鐣鹃幐澶愭暛
				this.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						char keyCode = e.getKeyChar();
						
						System.out.println(keyCode);
						switch(keyCode){
						case 'W'://娑撳﹪鏁幐澶夌瑓閿涘牊妫嗘潪顒婄礆
						case 'w':
						case KeyEvent.VK_UP:
							myTank.moveNext(MyTank.UP);
							draw.drawShape();
							break;
						case 'D'://閸欐娊鏁幐澶夌瑓
						case 'd':
						case KeyEvent.VK_RIGHT:
							myTank.moveNext(MyTank.RIGHT);
							draw.drawShape();
							break;
						case 'S'://娑撳鏁幐澶夌瑓
						case 's':
						case KeyEvent.VK_DOWN:
							myTank.moveNext(MyTank.DOWN);
							draw.drawShape();
							break;
						case 'A'://瀹革箓鏁幐澶夌瑓
						case 'a':
						case KeyEvent.VK_LEFT:
							myTank.moveNext(MyTank.LEFT);
							draw.drawShape();
							break;
						case KeyEvent.VK_SPACE://缁岀儤鐗搁柨顔藉瘻娑撳绱欓拃钘夌俺閿涳拷
							myTank.shootBullet();
							draw.drawShape();
							break;
						}
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
	}
	public void choice() {
		if(Choice.mapNumber == 1) {
			new AiTank(2,30,Tank.RIGHT,3);
			new AiTank(40,20,Tank.LEFT,1);
			new AiTank(18,3,Tank.DOWN,2);
			//new AiTank(22,4,Tank.UP,2);
		}
	}
	public static void next() {
		if(winFlag == 5) {
		Victory	victory = new Victory();			
		victory.setVisible(true);
		customspass.dispose();
		}
	}
	public static void isLose() {
		Lose lose = new Lose();			
		lose.setVisible(true);
		customspass.dispose();
	}
	/*public void loadImg() {
		ImageIcon origin_background = new ImageIcon("img\\tankebegin.png");
		ImageIcon origin_wall = new ImageIcon("img\\tankebegin.png");
		origin_wall.setImage(origin_wall.getImage().getScaledInstance(ELEMENT_SIZE, ELEMENT_SIZE, 0));
		ImageIcon origin_iron_wall = new ImageIcon("img\\tankebegin.png");
		ImageIcon origin_grass = new ImageIcon("img\\tankebegin.png");
		ImageIcon origin_water = new ImageIcon("img\\tankebegin.png");
		background  = new JLabel(origin_wall);
		wall = new JLabel(origin_wall);
		//wall.setBounds(71, 40,ELEMENT_SIZE, ELEMENT_SIZE);
		//contentPane.add(wall);
		water = new JLabel(origin_water);
		ironWall  = new JLabel(origin_grass);
		grass = new JLabel(origin_iron_wall);
		
		for(int x = 0;x < Map1.wall.length;x++) {
			for(int y = 0;y < Map1.wall[x].length;y++) {
				if(Map.wall[x][y] == 1) {
					wall = new JLabel(origin_wall);
					wall.setBounds(x*ELEMENT_SIZE, y*ELEMENT_SIZE, ELEMENT_SIZE, ELEMENT_SIZE);
					contentPane.add(wall);
				}
			}
		}
	}
	public void initialPainter()
	{
		int size1 = WINDOW_WIDTH / (TABLE_WIDTH + 1);
		int size2 = WINDOW_HEIGHT / (TABLE_HEIGHT + 1);
		
		ELEMENT_SIZE = size1 < size2 ? size1 : size2; 
	}
	public void drawWall() {//缂備焦锚閸╂鏅跺▎蹇旂
		for(int x = 0;x < Map1.wall.length;x++) {
			for(int y = 0;y < Map1.wall[x].length;y++) {
				if(Map.wall[x][y] == 1) {
					wall = new JLabel(origin_wall);
					wall.setBounds(x*ELEMENT_SIZE, y*ELEMENT_SIZE, ELEMENT_SIZE, ELEMENT_SIZE);
					contentPane.add(wall);
				}
			}
		}
	}*/
}
