package life.majing.community.community.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.unbescape.css.CssIdentifierEscapeType;

@Mapper
public class UserMapper {
    public void insert(User user);
}
