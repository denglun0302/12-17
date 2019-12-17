
public class Time {
	private int hour;
	private int minute;
	private int sec;
	
	public  Time(int hour,int minute,int sec)
	{
		if(hour<0||hour>23)
		{
			System.err.println("小时输入错误");
			return;
		}
		if(minute<0||minute>59)
		{
			System.err.println("分钟输入错误");
		return;
	    }
		if(sec<0||sec>59)
		{
			System.err.println("秒数输入错误");
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.sec=sec;
	}
	

	
//	public  Time timeafter(int h,int m,int s)
//	{
//		sec+=s;
//		minute+=m;
//		hour+=h;
//		while(sec>=60)
//		{
//			sec=sec-60;
//			minute+=1;
//			}
//      while(minute>=60)
//			{
//				minute=minute-60;
//				hour+=1;
//				
//			}
//		
//		return this;
//		
//	}
	public  Time timeafter(int s)
	{
		Time other=new Time(hour,minute,sec);
		other.sec+=s;
		
		while(other.sec>=60)
		{
			other.sec=other.sec-60;
			other.minute+=1;
			
            while(other.minute>=60)
			{
				other.minute=other.minute-60;
				other.hour+=1;
				if(other.hour>=24)
				{
					other.hour=other.hour-24;
		
				}
				
			}
		}
		
		return other;
		
	}
//	public Time timebefore(int h,int m,int s)
//	{
//		sec-=s;
//		minute-=m;
//		hour-=h;
//		while(sec<0)
//		{
//			sec=sec+60;
//			minute-=1;
//			}
//      while(minute<0)
//			{
//				minute=minute+60;
//				hour-=1;
//				
//			}
//		
//		return this;
//	}
	public Time timebefore(int s)
	{
		Time other=new Time(hour,minute,sec);
		other.sec-=s;
		while(other.sec<0)
		{
			other.sec=other.sec+60;
			other.minute-=1;
			
      while(other.minute<0)
			{
				other.minute=minute+60;
				other.hour-=1;
				if(other.hour<0)
				{
					other.hour=other.hour+24;
				}
				
			}
		}
		
		return other;
	}
	public static int diff(Time a, Time b) {
	int s1=(b.hour)*3600+(b.minute)*60+(b.sec);
	int s2=(a.hour)*3600+(a.minute)*60+(a.sec);
	int s=s1-s2;
	return s;
	
		
		
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,sec);
	}


   public static void main(String args[])
   {
	  
	   Time t1=new Time(8,32,0);
//	   Time d1=t1.timeafter(80);
	   Time t2=new Time(8,32,1);
//	   Time d2=t2.timebefore(80);
	   int s=diff(t1,t2);
	   System.out.println(s);
//       System.out.println(t1.toString());
//	   System.out.println(d1.toString());
//	   System.out.println(d2.toString());
//	   
	
   }
}

