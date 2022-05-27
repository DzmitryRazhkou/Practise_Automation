package Interface_AbstractClassConcept;

public class TestBank {
    public static void main(String[] args) {
        WellsFargo wf = new WellsFargo();
        wf.credit();
        wf.debit();
        wf.loan();
        wf.funds();

        Bank citi = new WellsFargo();
        citi.loan();
        citi.debit();
        citi.credit();
    }


}
