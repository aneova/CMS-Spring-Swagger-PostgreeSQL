package CMS.cms.vo;

import CMS.cms.models.Category;
import CMS.cms.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;

}
