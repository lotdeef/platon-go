pragma solidity ^0.4.12;
/**
* @file LibInvestorInfo.sol
* @author yiyating
* @time 2016-12-27
* @desc 出资方信息定义
*/


import "../utillib/LibInt.sol";
import "../utillib/LibString.sol";
import "../utillib/LibJson.sol";
import "../utillib/LibStack.sol";

library LibInvestorInfo {
    using LibInt for *;
    using LibString for *;
    using LibJson for *;
    using LibInvestorInfo for *;


  /**
  * @dev Contruction
  */
    struct InvestorInfo {
        uint id;                //id
        string businessNo;        //业务流水号
        address userId;         //发布者id
        string userName;          //用户姓名
        uint userType;          //发布者类型
        uint organizationType;  //发布者类型为机构时，具体机构类型
        uint area;              //投资者所在地区
        uint[] industry;          //意向投资行业
        uint minAmountScale;      //最小资金规模
        uint maxAmountScale;      //最大资金规模
        uint minAmountLastDate;   //最小资金期限
        uint maxAmountLastDate;   //最大资金期限
        uint createTimestamp;     //创建时间
        uint endTimestamp;        //关闭时间
        uint status;              //需求状态
    }

    /**
    *@desc fromJson for InvestorInfo
    *      Generated by juzhen SolidityStructTool automatically.
    *      Not to edit this code manually.
    */
    function fromJson(InvestorInfo storage _self, string _json) internal returns(bool succ) {
        _self.reset();
        if(LibJson.push(_json) == 0) {
            return false;
        }

        if (!_json.isJson()) {
            LibJson.pop();
            return false;
        }

        _self.id = _json.jsonRead("id").toUint();
        _self.businessNo = _json.jsonRead("businessNo");
        _self.userId = _json.jsonRead("userId").toAddress();
        _self.userName = _json.jsonRead("userName");
        _self.userType = _json.jsonRead("userType").toUint();
        _self.organizationType = _json.jsonRead("organizationType").toUint();
        _self.area = _json.jsonRead("area").toUint();
        _self.industry.fromJsonArray(_json.jsonRead("industry"));
        _self.minAmountScale = _json.jsonRead("minAmountScale").toUint();
        _self.maxAmountScale = _json.jsonRead("maxAmountScale").toUint();
        _self.minAmountLastDate = _json.jsonRead("minAmountLastDate").toUint();
        _self.maxAmountLastDate = _json.jsonRead("maxAmountLastDate").toUint();
        _self.createTimestamp = _json.jsonRead("createTimestamp").toUint();
        _self.endTimestamp = _json.jsonRead("endTimestamp").toUint();
        _self.status = _json.jsonRead("status").toUint();
        
        LibJson.pop();
        return true;
    }

    /**
    *@desc toJson for InvestorInfo
    *      Generated by juzhen SolidityStructTool automatically.
    *      Not to edit this code manually.
    */
    function toJson(InvestorInfo storage _self) internal constant returns (string _json) {
        uint len = 0;
        len = LibStack.push("{");
        len = LibStack.appendKeyValue("id", _self.id);
        len = LibStack.appendKeyValue("businessNo", _self.businessNo);
        len = LibStack.appendKeyValue("userId", _self.userId);
        len = LibStack.appendKeyValue("userName", _self.userName);
        len = LibStack.appendKeyValue("userType", _self.userType);
        len = LibStack.appendKeyValue("organizationType", _self.organizationType);
        len = LibStack.appendKeyValue("area", _self.area);
        len = LibStack.appendKeyValue("industry", _self.industry.toJsonArray());
        len = LibStack.appendKeyValue("minAmountScale", _self.minAmountScale);
        len = LibStack.appendKeyValue("maxAmountScale", _self.maxAmountScale);
        len = LibStack.appendKeyValue("minAmountLastDate", _self.minAmountLastDate);
        len = LibStack.appendKeyValue("maxAmountLastDate", _self.maxAmountLastDate);
        len = LibStack.appendKeyValue("createTimestamp", _self.createTimestamp);
        len = LibStack.appendKeyValue("endTimestamp", _self.endTimestamp);
        len = LibStack.appendKeyValue("status", _self.status);
        len = LibStack.append("}");
        _json = LibStack.popex(len);
    }

    /**
    *@desc update for InvestorInfo
    *      Generated by juzhen SolidityStructTool automatically.
    *      Not to edit this code manually.
    */
    function update(InvestorInfo storage _self, string _json) internal returns(bool succ) {
        if(LibJson.push(_json) == 0) {
            return false;
        }

        if (!_json.isJson()) {
            LibJson.pop();
            return false;
        }

        if (_json.jsonKeyExists("id"))
            _self.id = _json.jsonRead("id").toUint();
        if (_json.jsonKeyExists("businessNo"))
            _self.businessNo = _json.jsonRead("businessNo");
        if (_json.jsonKeyExists("userId"))
            _self.userId = _json.jsonRead("userId").toAddress();
        if (_json.jsonKeyExists("userName"))
            _self.userName = _json.jsonRead("userName");
        if (_json.jsonKeyExists("userType"))
            _self.userType = _json.jsonRead("userType").toUint();
        if (_json.jsonKeyExists("organizationType"))
            _self.organizationType = _json.jsonRead("organizationType").toUint();
        if (_json.jsonKeyExists("area"))
            _self.area = _json.jsonRead("area").toUint();
        if (_json.jsonKeyExists("industry"))
            _self.industry.fromJsonArray(_json.jsonRead("industry"));
        if (_json.jsonKeyExists("minAmountScale"))
            _self.minAmountScale = _json.jsonRead("minAmountScale").toUint();
        if (_json.jsonKeyExists("maxAmountScale"))
            _self.maxAmountScale = _json.jsonRead("maxAmountScale").toUint();
        if (_json.jsonKeyExists("minAmountLastDate"))
            _self.minAmountLastDate = _json.jsonRead("minAmountLastDate").toUint();
        if (_json.jsonKeyExists("maxAmountLastDate"))
            _self.maxAmountLastDate = _json.jsonRead("maxAmountLastDate").toUint();
        if (_json.jsonKeyExists("createTimestamp"))
            _self.createTimestamp = _json.jsonRead("createTimestamp").toUint();
        if (_json.jsonKeyExists("endTimestamp"))
            _self.endTimestamp = _json.jsonRead("endTimestamp").toUint();
        if (_json.jsonKeyExists("status"))
            _self.status = _json.jsonRead("status").toUint();
        
        LibJson.pop();
        return true;
    }

    /**
    *@desc reset for InvestorInfo
    *      Generated by juzhen SolidityStructTool automatically.
    *      Not to edit this code manually.
    */
    function reset(InvestorInfo storage _self) internal {
        delete _self.id;
        delete _self.businessNo;
        delete _self.userId;
        delete _self.userName;
        delete _self.userType;
        delete _self.organizationType;
        delete _self.area;
        _self.industry.length = 0;
        delete _self.minAmountScale;
        delete _self.maxAmountScale;
        delete _self.minAmountLastDate;
        delete _self.maxAmountLastDate;
        delete _self.createTimestamp;
        delete _self.endTimestamp;
        delete _self.status;
    }
}