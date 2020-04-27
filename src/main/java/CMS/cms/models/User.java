package CMS.cms.models;

import lombok.Data;

import javax.management.relation.Role;

@Data
public class User {
    String id;
    String identity;
    String name;
    Role role;
}
