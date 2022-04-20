package features;

import com.abnamro.service.BaseService;
import features.Account.OpenPrivateAccountTestsSteps;
import net.thucydides.core.annotations.Steps;

public class BaseTest extends BaseService {

    //Tags
    public static final String POSITIVE_TEST = "Positive";
    public static final String NEGATIVE_TEST = "Negative";

    @Steps
    public OpenPrivateAccountTestsSteps openPrivateAccountTestsSteps;
}
