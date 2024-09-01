package cn.vorbote.vocabbuddy.model.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * UserLogDTO
 * <p>
 * Created at 12:56, 24 May 2023
 *
 * @author Zihlu WANG
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public final class UserLogDTO {

    private Long id;

    private Long userId;

    private String operation;

}
