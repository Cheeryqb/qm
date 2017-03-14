package com.alienlab.niit.qm.controller;

import com.alienlab.niit.qm.controller.util.ExecResult;
import com.alienlab.niit.qm.entity.TbUserEntity;
import com.alienlab.niit.qm.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 橘 on 2017/3/14.
 */
@Api(value="/qm-api/user",description = "用户API")
@RestController
@RequestMapping("/qm-api")
public class UserController {
    @Autowired
    UserService userService;
    @ApiOperation(value="获取用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name="keyword",value="查询关键字",paramType = "query"),
            @ApiImplicitParam(name="index",value="分页位置",paramType = "query"),
            @ApiImplicitParam(name="length",value="分页长度",paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "", response = TbUserEntity.class),
            @ApiResponse(code = 500, message = "", response = ExecResult.class)
    })
    @GetMapping(value="/user")
    public ResponseEntity listUser(@RequestParam String keyword,@RequestParam int index,@RequestParam int length){
        try {
            Page<TbUserEntity> users=userService.listUser(keyword,new PageRequest(index,length));
            return ResponseEntity.ok().body(users);
        } catch (Exception e) {
            e.printStackTrace();
            ExecResult er=new ExecResult(false,e.getMessage());
            //发生错误返回500状态
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(er);
        }
    }
}
