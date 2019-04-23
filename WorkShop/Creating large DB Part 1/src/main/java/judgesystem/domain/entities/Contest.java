package judgesystem.domain.entities;

import judgesystem.domain.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "contests")
public class Contest extends BaseEntity {

    private String name;
    private Category category;
    private Set<Problem> problems;
    private Set<User> contestants;
    private Set<MaxResultForContest> maxResultForContests;


    @Column
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @OneToMany(mappedBy = "contest")
    public Set<Problem> getProblems() {
        return this.problems;
    }

    public void setProblems(Set<Problem> problems) {
        this.problems = problems;
    }

    @ManyToMany(mappedBy = "contests")
    public Set<User> getContestants() {
        return this.contestants;
    }

    public void setContestants(Set<User> contestants) {
        this.contestants = contestants;
    }

    @OneToMany(mappedBy = "contest")
    public Set<MaxResultForContest> getMaxResultForContests() {
        return this.maxResultForContests;
    }

    public void setMaxResultForContests(Set<MaxResultForContest> maxResultForContests) {
        this.maxResultForContests = maxResultForContests;
    }
}
