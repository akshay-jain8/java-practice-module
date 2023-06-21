package com.softdebugs.javapracticemodule.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "owned_by")
    private String ownedBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo user)) return false;
        return getId() == user.getId()
                && Objects.equals(getOwnedBy(), user.getOwnedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOwnedBy());
    }
}

