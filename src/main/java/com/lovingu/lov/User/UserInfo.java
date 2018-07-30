package com.lovingu.lov.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: ${description}
 * @author: Niu Haoxuan
 * @create: 2018-07-30 18:02
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

  long id;
  long wxOpenId;
  String NickName;

}
