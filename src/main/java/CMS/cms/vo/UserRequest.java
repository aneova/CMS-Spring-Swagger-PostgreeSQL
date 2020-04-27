package CMS.cms.vo;

import CMS.cms.models.Role;
import lombok.Data;


@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
