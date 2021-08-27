package performance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForeachTest {

    public static void main(String[] args) {
        List<ForeachTest> foreachTests = new ArrayList<>();
        foreachTests.add(new ForeachTest(1));
        foreachTests.add(new ForeachTest(2));
        foreachTests.add(new ForeachTest(3));
        foreachTests.add(new ForeachTest(4));

        for(ForeachTest foreachTest : foreachTests){
            foreachTest.setAddReason("t");
        }
    }
    private int subsId;
    private String subsItemName;
    private BigDecimal expAmt;
    private BigDecimal payAmt;
    private String addReason;

    ForeachTest(int subsId){
        this.subsId = subsId;
    }

    public int getSubsId() {
        return subsId;
    }

    public void setSubsId(int subsId) {
        this.subsId = subsId;
    }

    public String getSubsItemName() {
        return subsItemName;
    }

    public void setSubsItemName(String subsItemName) {
        this.subsItemName = subsItemName;
    }

    public BigDecimal getExpAmt() {
        return expAmt;
    }

    public void setExpAmt(BigDecimal expAmt) {
        this.expAmt = expAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public String getAddReason() {
        return addReason;
    }

    public void setAddReason(String addReason) {
        this.addReason = addReason;
    }
}
