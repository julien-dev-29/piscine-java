package Strategy;

public class Context implements OperationStrategy {
    private OperationStrategy operationStrategy;

    public Context() {
        this.operationStrategy = new AddStrategy();
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public int execute(int a, int b) {
        return this.operationStrategy.execute(a, b);
    }
}
