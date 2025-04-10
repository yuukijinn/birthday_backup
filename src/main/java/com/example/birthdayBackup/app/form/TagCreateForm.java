package com.example.birthdayBackup.app.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * タグ作成用フォーム
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagCreateForm {
    //タグ名称
    private String tagName;
}
