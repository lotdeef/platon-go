package versioncompatible.v0_5_0.v7_dataLocation;

import beforetest.ContractPrepareTest;
import network.platon.autotest.junit.annotations.DataSource;
import network.platon.autotest.junit.enums.DataSourceType;
import network.platon.contracts.DataLocation;
import org.junit.Before;
import org.junit.Test;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;

import java.math.BigInteger;


/**
 * @title  06- 存储区域
 * 1-结构体(struct)，数组(array)，
 *   映射(mapping)类型的变量必须显式声明存储区域( storage， memeory， calldata)，
 *   包括函数参数和返回值变量都必须显式声明
 * 2-external 的函数的引用参数和映射参数需显式声明为 calldata
 * @description: 
 * @author: hudenian
 * @create: 2019/12/26
 */
public class DataLocationTest extends ContractPrepareTest {

    private String id = "1";

    private String name = "hudenian";

    private String age = "30";

    @Before
    public void before() {
        this.prepare();
    }


    @Test
    @DataSource(type = DataSourceType.EXCEL, file = "test.xls", sheetName = "Sheet1",
            author = "hudenian", showName = "version_compatible.0.5.0.DataLocationTest-存储区域")
    public void update() {
        try {

            DataLocation dataLocation = DataLocation.deploy(web3j, transactionManager, provider).send();

            String contractAddress = dataLocation.getContractAddress();
            TransactionReceipt tx = dataLocation.getTransactionReceipt().get();

            collector.logStepPass("FunctionDeclaraction deploy successfully.contractAddress:" + contractAddress + ", hash:" + tx.getTransactionHash());

            TransactionReceipt transactionReceipt = dataLocation.savePerson(new BigInteger(id),name,new BigInteger(age)).send();

            collector.logStepPass("FunctionDeclaraction update_public successful.transactionHash:" + transactionReceipt.getTransactionHash());
            collector.logStepPass( "currentBlockNumber:" + transactionReceipt.getBlockNumber());

            Tuple2<String, BigInteger> tuple = dataLocation.getPerson(new BigInteger(id)).send();
            //获取用户名
            collector.assertEqual(name,tuple.getValue1().toString());

            //获取年龄
            collector.assertEqual(name,tuple.getValue2().toString());

            byte[] nameByteArr = name.getBytes();

            TransactionReceipt transactionReceiptBytes = dataLocation.testBytes(nameByteArr).send();

            collector.logStepPass("FunctionDeclaraction update_public successful.transactionHash:" + transactionReceiptBytes.getTransactionHash());
            collector.logStepPass( "currentBlockNumber:" + transactionReceiptBytes.getBlockNumber());

            byte[] bytes = dataLocation.getBytes().send();

            collector.assertEqual(nameByteArr.toString(),bytes.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
