import com.olab.toolkit.utils.genericschedular.Consumer;
import com.olab.toolkit.utils.genericschedular.GenericSchedular;
import com.olab.toolkit.utils.genericschedular.Producer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CloseJobOrderScheduler extends GenericSchedular {

    protected CloseJobOrderScheduler(Producer producer, Consumer consumer) {
        super(producer, consumer);
    }

    @Scheduled(cron = "${order-closure-job.cron}")
    public void activateCloseJobOrderScheduler() {
        this.execute();
    }
}
