package com.example.birthdayBackup.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * タグドメインモデル
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    //タグID
    private Long tagId;
    //タグ名称
    private String tagName;
    //更新回数
    private Long version;
}
