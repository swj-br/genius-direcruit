package com.sfac.geniusdirecruit.hsyetem.entity;

import com.sfac.geniusdirecruit.common.entity.ResultEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User extends ResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String userName;
}
