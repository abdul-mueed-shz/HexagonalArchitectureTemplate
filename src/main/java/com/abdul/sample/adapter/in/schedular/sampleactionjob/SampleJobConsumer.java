//
//import lombok.RequiredArgsConstructor;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class SampleJobConsumer implements Consumer {
//
//    private final CompleteSampleJobUseCase completeSampleJobUseCase;
//
//    /**
//     * update order completion jobs to complete order.
//     * @param id Long
//     */
//    @Override
//    @Async("sampleSchedulerThreadExecutor")
//    public synchronized void consume(Long id) {
//        completeSampleJobUseCase.completeJobOrder(id);
//    }
//}
//
//
