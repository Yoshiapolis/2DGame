
public class TestSword extends Sword{
	public TestSword() {
		super();
		super.setID(101);
		super.setSpeed(0);
		super.setImages("/Assets/StoneSwordIdle.png", "/Assets/StoneSword.png", "/Assets/StoneSwordLeft.png", "/Assets/StoneSwordUp.png", "/Assets/StoneSwordDown.png");
		super.setDamage(2);
		super.setCriticalHit(0.1f);
		super.changeImage(1);
	}
}
