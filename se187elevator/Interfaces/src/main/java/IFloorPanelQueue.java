
public interface IFloorPanelQueue {
	void putFloorRequest(int currentFloornumber, Direction direction);
	void setMetaContoller(IMetaController metaController);
}
