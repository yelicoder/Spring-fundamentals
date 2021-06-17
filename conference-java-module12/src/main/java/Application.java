import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        ProxyFactory factory = new ProxyFactory(new SpeakerServiceImpl(new HibernateSpeakerRepositoryImpl()));
        factory.addInterface(SpeakerService.class);
        SpeakerService proxy = (SpeakerService) factory.getProxy();
        System.out.println(proxy.findAll().get(0).getFirstName());

    }
}
