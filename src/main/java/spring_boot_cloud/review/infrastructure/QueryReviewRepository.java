package spring_boot_cloud.review.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryReviewRepository extends JpaRepository<ReviewEntity, Long> {
}
