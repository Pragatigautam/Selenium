package one;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lol {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#email")).sendKeys("pragatigautam882@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Appl3p13#");
		driver.findElement(By.cssSelector("#u_0_5_vq")).click();
		
		
		driver.get("https://www.facebook.com/")
		
		//add wait here
		
		
		
		driver.findElement(By.cssSelector("#mount_0_0_px > div > div:nth-child(1) > div > div:nth-child(3) > div.xds687c.x1pi30zi.x1e558r4.xixxii4.x13vifvy.xzkaem6 > div.x6s0dn4.x78zum5.x15zctf7.x1s65kcs.x1n2onr6.x1ja2u2z > div:nth-child(3) > span > span > div > div.x1i10hfl.x6umtig.x1b1mbwd.xaqea5y.xav7gou.x1ypdohk.xe8uvvx.xdj266r.x11i5rnm.xat24cr.x1mh8g0r.x16tdsg8.x1hl2dhg.xggy1nq.x87ps6o.x1lku1pv.x1a2a7pz.x6s0dn4.x14yjl9h.xudhj91.x18nykt9.xww2gxu.x972fbf.xcfux6l.x1qhh985.xm0m39n.x9f619.x78zum5.xl56j7k.xexx8yu.x4uap5.x18d9i69.xkhd6sd.x1n2onr6.x1vqgdyp.x100vrsf.x1qhmfi1 > svg > path")).click();
		//add wait here
		driver.findElement(By.cssSelector("#\\:r0\\: > div > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(1) > div > div > div > a > div.x9f619.x1n2onr6.x1ja2u2z.x1qjc9v5.x78zum5.xdt5ytf.x1iyjqo2.xl56j7k.xeuugli.x1sxyh0.xurb0ha.xsag5q8.xz9dl7a.xykv574.xbmpl8g.x4cne27.xifccgj > div > div.x9f619.x1n2onr6.x1ja2u2z.x78zum5.x1iyjqo2.xs83m0k.xeuugli.x1qughib.x6s0dn4.x1a02dak.x1q0g3np.xdl72j9 > div > div > div > div.x6s0dn4.xi81zsa.x78zum5.x1hshjfz > span.x6s0dn4.x78zum5.x193iq5w.xeuugli.xg83lxy > span > span")).click();
		//add wait here
		driver.findElement(By.cssSelector("#mount_0_0_px > div > div:nth-child(1) > div > div:nth-child(6) > div > div.xuk3077.x78zum5.xc8icb0 > div.x1ey2m1c.x78zum5.x164qtfw.xixxii4.x1vjfegm > div > div > div > div > div > div.x78zum5.xdt5ytf.x1iyjqo2.x193iq5w.x2lwn1j.x1n2onr6 > div:nth-child(2) > div > div > div.x78zum5.x1iyjqo2.x6q2ic0 > div.xmjcpbm.x107yiy2.xv8uw2v.x1tfwpuw.x2g32xy.x9f619.x1iyjqo2.xeuugli > div > div > div.xzsf02u.x1a2a7pz.x1n2onr6.x14wi4xw.x1iyjqo2.x1gh3ibb.xisnujt.xeuugli.x1odjw0f.notranslate > p")).sendKeys("Hi baby, sending text through selenium");
		
		
		

	}

}
