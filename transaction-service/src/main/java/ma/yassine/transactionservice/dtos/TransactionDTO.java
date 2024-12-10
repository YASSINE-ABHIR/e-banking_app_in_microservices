package ma.yassine.transactionservice.dtos;

import lombok.Getter;
import lombok.Setter;
import ma.yassine.transactionservice.enums.TransactionType;

@Getter
@Setter
public class TransactionDTO {
    private String ribSender;
    private String ribReceiver;
    private double amount;
    private String description;
    private TransactionType transactionType;
}
