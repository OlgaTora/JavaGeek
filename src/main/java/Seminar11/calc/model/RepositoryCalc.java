package Seminar11.calc.model;

public abstract class RepositoryCalc implements Repository{
    private Logger logger;
    public final String addition = "+";
    public final String subtract = "-";
    public final String multiply = "*";
    public final String division = "/";

    public RepositoryCalc(Logger logger){
        this.logger = logger;}


    @Override
    public void help() {
        System.out.println("Help: i could work with rational" +
                " and complex numbers! That's all");
    }
    public void saveResult(String result) {
        logger.saveLine(result);
    }

}

