
public class TestChest extends Chest{
	public TestChest(int id, int[][] contents) {
		super.setID(id);
		super.setContents(contents);
		super.setKeyRequirement(true);
		super.setImage("src/Assets/ChestGold.png", "src/Assets/HarpSeal.png");
	}
}
