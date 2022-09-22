package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 10, 161, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 37, 112, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 57, 72, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(105, 57, 72, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(178, 57, 72, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
			
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn4.setBounds(251, 57, 72, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(22, 100, 141, 15);
		contentPane.add(lblNewLabel_2);
		
		txtf1 = new JTextField();
		txtf1.setBounds(42, 128, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(42, 159, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(42, 190, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Result = new JLabel("결과 :");
		lblTxtf1Result.setBounds(230, 131, 166, 15);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 :");
		lblTxtf2Result.setBounds(230, 162, 177, 15);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 :");
		lblTxtf3Result.setBounds(230, 193, 166, 15);
		contentPane.add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : " + txt);
			}
		});
		btnTxtf1.setBounds(158, 127, 60, 23);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Result.setText("결과 : " + txt);
			}
		});
		btnTxtf2.setBounds(158, 158, 60, 23);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Result.setText("결과 : " + txt);
			}
		});
		btnTxtf3.setBounds(158, 189, 60, 23);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(22, 241, 141, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(32, 272, 102, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(32, 296, 60, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(94, 296, 60, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(158, 296, 60, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(226, 296, 59, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(289, 296, 66, 23);
		contentPane.add(chk5);
		
		JLabel lblChkResult = new JLabel("결과 :");
		lblChkResult.setBounds(32, 325, 347, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + chks.toString());
			}
		});
		btnChk.setBounds(363, 296, 60, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(22, 363, 132, 15);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(22, 384, 66, 23);
		contentPane.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(97, 384, 66, 23);
		contentPane.add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdFemale);
		bg.add(rdMale);
		
		JLabel lblGenderResult = new JLabel("결과 :");
		lblGenderResult.setBounds(32, 413, 151, 15);
		contentPane.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String result = null;
				
				if(rdMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자");
				}else {
					lblGenderResult.setText("결과 : 여자");
				}
			}
		});
		btnGender.setBounds(178, 384, 60, 23);
		contentPane.add(btnGender);
	}
}
