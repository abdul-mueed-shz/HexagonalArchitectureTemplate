import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class SampleJobProducer implements Producer {

    private final SampleJobUseCase sampleJobUseCase;

    private final Set<Long> processedIds = ConcurrentHashMap.newKeySet();

    /**
     * fetch jobs to close order.
     *
     * @return Long
     */
    @Override
    public List<Long> produce() {
        List<Long> unprocessedIds = sampleJobUseCase.fetchAllJobForToday(Timestamp.valueOf(LocalDateTime.now()),
                Collections.singletonList(SampleEnums.PENDING.value()),
                SampleEnums.COMPLETE.value());
        List<Long> newIds = unprocessedIds.stream()
                .filter(id -> !processedIds.contains(id))
                .collect(Collectors.toList());
        processedIds.addAll(newIds);

        return newIds;
    }
}
