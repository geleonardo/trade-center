package com.lmt.mbsp.trade.model.pageUtil;

import com.lmt.framework.support.entity.QueryEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 描述: 分页查询对象.
 * 作者: Tangsm.
 * 创建时间: 2018-08-08 18:37
 */
@Data
@ApiModel("分页查询条件")
public class PageQueryEntity implements QueryEntity {
    @ApiModelProperty(value = "当前页")
    private Integer pageNum;
    @ApiModelProperty(value = "每页显示条数")
    private Integer pageSize;
    @ApiModelProperty(value = "总条数", hidden = true)
    private Integer total;
    @ApiModelProperty(value = "起始索引", hidden = true)
    private Integer start;
}
