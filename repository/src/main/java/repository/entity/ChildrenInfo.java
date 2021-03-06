package repository.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "children_info")
public class ChildrenInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "how_many_children_do_you_have")
    private Integer howManyChildrenDoYouHave;

    @Column(name = "no_children")
    private Boolean noChildren;

    @Column(name = "children_plans")
    private Integer childrenPlans;

    @Column(name = "how_many_children_do_you_want")
    private Integer howManyChildrenDoYouWant;

    @Column(name = "dont_know_how_many")
    private Boolean dontKnowHowMany;

    @ToString.Exclude
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Person personInChildrenInfo;
}
