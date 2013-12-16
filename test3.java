package test3;
import java.applet.Applet;
import java.awt.Graphics;

public class test3 extends Applet{
	public void paint(Graphics g){
		int [] data={40,70,-20,100,-80,60}; /*配列データ*/
		int sum=0;/*合計値初期化*/
		
		for(int i=0;i<data.length;i++){/*iを0からデータ数-1回分回す*/
			sum=sum+data[i]; /*合計値に配列データを足す*/
		}
		
		double ave = (double) sum/ data.length; /*平均値算出*/
		g.drawString("平均値="+ave, 35, 35); /*平均値を描画*/
		
		int startX=40; /*左端の長方形のx座標*/
		int baseY=140; /*基準となるy座標*/
		int width= 20; /*長方形の幅*/
		
		for(int i=0;i<data.length;i++){/*iを0からデータ数-1回分回す*/
			drawBar(startX+i*20,baseY,width,data[i],g); /*グラフ描画*/
			}
		
		
	
	    g.drawLine(40,140,160,140); /*beseYの位置に始点40,140終点160,140の横線描画*/
	}
	void drawBar(int x,int by,int w,int d,Graphics g){
		if(d>0){
			g.drawRect(x,by-d,w,d);
		}else{
			g.drawRect(x, by, w, d);
		}
	}	
	}