package ma.yassine.transactionservice.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.yassine.transactionservice.enums.TransactionType;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    private Date date;
    private String ribSender;
    private String ribReceiver;
    private TransactionType transactionType;

    @PrePersist
    private void generateDate(){
        if(this.date == null){
            this.date = new Date();
        }
    }
}
