package faang.school.postservice.publisher;

import faang.school.postservice.dto.kafka.KafkaPostViewEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaPostViewProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    @Value("${spring.data.kafka.topics.post-views}")
    private String postViewsTopic;

    public void publish(KafkaPostViewEvent event){
        kafkaTemplate.send(postViewsTopic, event);

        log.info("Post event was published to kafka with post ID: {}", event.getPostId());
    }
}