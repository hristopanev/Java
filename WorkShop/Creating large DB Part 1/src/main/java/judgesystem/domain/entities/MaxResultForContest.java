package judgesystem.domain.entities;

import judgesystem.domain.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity(name = "max_results_for_contests")
public class MaxResultForContest extends BaseEntity {

    private User user;
    private Contest contest;
    private Double averagePerformance;
    private Double totalPoints;

    @ManyToOne
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @ManyToOne
    public Contest getContest() {
        return this.contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    @Column(name = "average_performance")
    public Double getAveragePerformance() {
        return this.averagePerformance;
    }

    public void setAveragePerformance(Double averagePerformance) {
        this.averagePerformance = averagePerformance;
    }

    @Column(name = "total_points")
    public Double getTotalPoints() {
        return this.totalPoints;
    }

    public void setTotalPoints(Double totalPoints) {
        this.totalPoints = totalPoints;
    }
}
