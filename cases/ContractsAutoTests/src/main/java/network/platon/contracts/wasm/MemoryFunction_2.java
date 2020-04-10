package network.platon.contracts.wasm;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.WasmContract;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.9.1.2-SNAPSHOT.
 */
public class MemoryFunction_2 extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001350a60027f7f0060000060017f017f60017f0060037f7f7f0060027f7f017f60037f7f7f017f60047f7f7f7f006000017f60017f017e025d0403656e760c706c61746f6e5f70616e6963000103656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000803656e7610706c61746f6e5f6765745f696e707574000303656e760d706c61746f6e5f72657475726e000003302f01060001020502020401010504030100010303060202020207000002030204000002000000000400030305010900010405017001030305030100020615037f0141e08a040b7f0041e08a040b7f0041d60a0b075406066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300040b5f5f686561705f6261736503010a5f5f646174615f656e6403020f5f5f66756e63735f6f6e5f65786974001406696e766f6b65002f0908010041010b02162c0ac5342f1c00100741a40a420037020041ac0a410036020010124101101510320ba20a010d7f2002410f6a210f410020026b21072002410e6a210a410120026b210e2002410d6a210d410220026b210c0340200020056a2103200120056a220441037145200220054672450440200320042d00003a0000200f417f6a210f200741016a2107200a417f6a210a200e41016a210e200d417f6a210d200c41016a210c200541016a21050c010b0b200220056b210602400240024002402003410371220b044020064120490d03200b4101460d01200b4102460d02200b4103470d032003200120056a280200220a3a0000200041016a210b200220056b417f6a210c200521030340200c4113494504402003200b6a2208200120036a220941046a2802002206411874200a41087672360200200841046a200941086a2802002204411874200641087672360200200841086a2009410c6a28020022064118742004410876723602002008410c6a200941106a280200220a411874200641087672360200200341106a2103200c41706a210c0c010b0b2002417f6a2007416d2007416d4b1b200f6a4170716b20056b2106200120036a41016a2104200020036a41016a21030c030b2006210403402004411049450440200020056a2203200120056a2202290200370200200341086a200241086a290200370200200541106a2105200441706a21040c010b0b027f2006410871450440200120056a2104200020056a0c010b200020056a2202200120056a2201290200370200200141086a2104200241086a0b21052006410471044020052004280200360200200441046a2104200541046a21050b20064102710440200520042f00003b0000200441026a2104200541026a21050b2006410171450d03200520042d00003a000020000f0b2003200120056a2206280200220a3a0000200341016a200641016a2f00003b0000200041036a210b200220056b417d6a210720052103034020074111494504402003200b6a2208200120036a220941046a2802002206410874200a41187672360200200841046a200941086a2802002204410874200641187672360200200841086a2009410c6a28020022064108742004411876723602002008410c6a200941106a280200220a410874200641187672360200200341106a2103200741706a21070c010b0b2002417d6a200c416f200c416f4b1b200d6a4170716b20056b2106200120036a41036a2104200020036a41036a21030c010b2003200120056a2206280200220d3a0000200341016a200641016a2d00003a0000200041026a210b200220056b417e6a210720052103034020074112494504402003200b6a2208200120036a220941046a2802002206411074200d41107672360200200841046a200941086a2802002204411074200641107672360200200841086a2009410c6a28020022064110742004411076723602002008410c6a200941106a280200220d411074200641107672360200200341106a2103200741706a21070c010b0b2002417e6a200e416e200e416e4b1b200a6a4170716b20056b2106200120036a41026a2104200020036a41026a21030b20064110710440200320042d00003a00002003200428000136000120032004290005370005200320042f000d3b000d200320042d000f3a000f200441106a2104200341106a21030b2006410871044020032004290000370000200441086a2104200341086a21030b2006410471044020032004280000360000200441046a2104200341046a21030b20064102710440200320042f00003b0000200441026a2104200341026a21030b2006410171450d00200320042d00003a00000b20000bdf0201017f02402001450d00200041003a0000200020016a2202417f6a41003a000020014103490d00200041003a0002200041003a00012002417d6a41003a00002002417e6a41003a000020014107490d00200041003a00032002417c6a41003a000020014109490d002000410020006b41037122026a220041003602002000200120026b417c7122026a2201417c6a410036020020024109490d002000410036020820004100360204200141786a4100360200200141746a410036020020024119490d002000410036021820004100360214200041003602102000410036020c200141706a41003602002001416c6a4100360200200141686a4100360200200141646a41003602002002200041047141187222026b2101200020026a2100034020014120490d0120004200370300200041186a4200370300200041106a4200370300200041086a4200370300200041206a2100200141606a21010c000b000b0b3501017f230041106b220041e08a0436020c418408200028020c41076a41787122003602004180082000360200418c083f003602000b9f0101047f230041106b220224002002200036020c027f02400240024020000440418c08200041086a22014110762200418c082802006a2203360200418408200141840828020022016a41076a4178712204360200200341107420044d0d0120000d020c030b41000c030b418c08200341016a360200200041016a21000b200040000d0010000b20012002410c6a410410051a200141086a0b200241106a24000b5901027f230041106b220224000240200045200145720d002002410036020c2002410c6a200041786a410410051a200228020c20014904402001100822032000200228020c10051a0c010b200021030b200241106a240020030b2f01027f2000410120001b2100034002402000100822010d004190082802002202450d0020021101000c010b0b20010b7801027f20002101024003402001410371044020012d0000450d02200141016a21010c010b0b2001417c6a21010340200141046a22012802002202417f73200241fffdfb776a7141808182847871450d000b0340200241ff0171450d01200141016a2d00002102200141016a21010c000b000b200120006b0bbf0301057f024020002001460d00027f02400240200120006b20026b410020024101746b4b044020002001734103712103200020014f0d012003450d0220000c030b20002001200210051a0f0b024020030d002001417f6a21040340200020026a220341037104402002450d052003417f6a200220046a2d00003a00002002417f6a21020c010b0b2000417c6a21042001417c6a2103034020024104490d01200220046a200220036a2802003602002002417c6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200241046a21052002417f73210303400240200120046a2106200020046a2207410371450d0020022004460d03200720062d00003a00002005417f6a2105200341016a2103200441016a21040c010b0b200220046b2101410021000340200141044f0440200020076a200020066a280200360200200041046a21002001417c6a21010c010b0b200020066a210120022003417c2003417c4b1b20056a417c716b20046b2102200020076a0b210003402002450d01200020012d00003a00002002417f6a2102200041016a2100200141016a21010c000b000b0b0a0041940841013602000b0a0041940841003602000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204101020000b6d01027f2002417049044002402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204100a21032000200236020420002004410172360200200020033602080b2002047f20032001200210050520030b1a200220036a41003a00000f0b000b130020002d0000410171044020002802081a0b0b2301017f03402000410c470440200041a40a6a4100360200200041046a21000c010b0b0bab0101047f024002402000200173410371044020002102200121030c010b034020014103710440200020012d000022023a00002002450d03200041016a2100200141016a21010c010b0b0340200020046a2102200120046a22032802002205417f73200541fffdfb776a71418081828478710d0120022005360200200441046a21040c000b000b0340200220032d000022003a000020000440200241016a2102200341016a21030c010b0b0b0b7601037f100d41980828020021000340200004400340419c08419c082802002201417f6a22023602002001410148450440200020024102746a22004184016a280200200041046a280200100e110300100d41980828020021000c010b0b419c084120360200419808200028020022003602000c010b0b0b930101027f100d419808280200220145044041980841a00836020041a00821010b0240419c0828020022024120460440418402100822010440200141840210060b2001450d0120014198082802003602004198082001360200419c084100360200410021020b419c08200241016a360200200120024102746a22014184016a4100360200200141046a2000360200100e0f0b100e0b070041a40a10110b780020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000101820012802044f0d002002410471450440200042003702000c010b10000b024002402002411071450d002000101820012802044d0d0020024104710d01200042003702000b20000f0b100020000b290002402000280204044020002802002c0000417f4c0d0141010f0b41000f0b200010192000101a6a0b240002402000280204450d0020002802002c0000417f4c0d0041000f0b2000101f41016a0b8a0301047f0240024020002802040440200010204101210220002802002c00002201417f4c0d010c020b41000f0b200141ff0171220241b7014d0440200241807f6a0f0b02400240200141ff0171220141bf014d04400240200041046a22042802002201200241c97e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b200241384f0d010c020b200141f7014d0440200241c07e6a0f0b0240200041046a22042802002201200241897e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b20024138490d010b200241ff7d490d010b100020020f0b20020b3902017f017e230041306b2201240020012000290200220237031020012002370308200141186a200141086a411410171018200141306a24000b5e01027f2000027f027f2001280200220504404100200220036a200128020422014b2001200249720d011a410020012003490d021a200220056a2104200120026b20032003417f461b0c020b41000b210441000b360204200020043602000b2101017f2001101a220220012802044b044010000b20002001200110192002101c0b900302097f017e230041406a220224002001280208220341004b0440200241386a2001101d200220022903383703182001200241186a101b36020c200241306a2001101d410021032001027f410020022802302205450d001a410020022802342207200128020c2204490d001a200720042004417f461b210820050b360210200141146a2008360200200141086a41003602000b200141106a2104200141146a21072001410c6a2105200141086a210803400240200341004f0d002007280200450d00200241306a2001101d41002103027f20022802302209044041002002280234220a20052802002206490d011a200a20066b2103200620096a0c010b41000b210620072003360200200420063602002002200336022c2002200636022820022002290328370310200241306a20044100200241106a101b101c20042002290330220b37020020052005280200200b422088a76a3602002008200828020041016a22033602000c010b0b20022004290200220b3703202002200b3703082000200241086a411410171a200241406b24000b4101017f02402000280204450d0020002802002d0000220041bf014d0440200041b801490d01200041c97e6a0f0b200041f801490d00200041897e6a21010b20010b4401017f200028020445044010000b0240200028020022012d0000418101470d00200041046a28020041014d047f100020002802000520010b2c00014100480d0010000b0b9f0101037f02402000280204044020001020200028020022022c000022014100480d0120014100470f0b41000f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200041046a28020041014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a200041046a280200200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0b2c002000200220016b22021024200028020020002802046a2001200210051a2000200028020420026a3602040b9d0201077f02402001450d002000410c6a2107200041106a2105200041046a21060340200528020022022007280200460d01200241786a28020020014904401000200528020021020b200241786a2203200328020020016b220136020020010d01200520033602002000410120062802002002417c6a28020022016b22021025220341016a20024138491b2204200628020022086a10262004200120002802006a22046a2004200820016b100c0240200241374d0440200028020020016a200241406a3a00000c010b200341f7016a220441ff014d0440200028020020016a20043a00002000280200200120036a6a210103402002450d02200120023a0000200241087621022001417f6a21010c000b000b10000b410121010c000b000b0b1b00200028020420016a220120002802084b04402000200110270b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b0f00200020011027200020013602040b3901017f200028020820014904402001100822022000280200200028020410051a20002802001a200041086a2001360200200020023602000b0b2500200041011024200028020020002802046a20013a00002000200028020441016a3602040b2b01027f20011025220241b7016a22034180024e044010000b2000200341ff01711028200020012002102a0b3d002000200028020420026a1026200028020020002802046a417f6a2100034020010440200020013a0000200141087621012000417f6a21000c010b0b0ba00101037f230041106b2202240020012802002103024002400240024020012802042201410146044020032c000022044100480d012000200441ff017110280c040b200141374b0d010b200020014180017341ff017110280c010b2000200110290b2002200136020c2002200336020820022002290308370300200020022802002201200120022802046a10222000410010230b200041011023200241106a24000b070041b00a10110b8e0101047f230041106b22022400200241bc0a102e21012000027f20022d00002200410171450440200041017641016a0c010b200128020441016a0b220010082000100922002203027f20022d000022044101714504402000200441017641016a1006200141016a0c010b2000200128020441016a100620012802080b10132003102e1a20011011200241106a24000b1f0020004200370200200041086a4100360200200020012001100b101020000b8a0602077f017e230041f0006b22002400100410012201100822021002200020013602442000200236024020002000290340370308200041406b200041106a200041086a411c1017101e200041406b102002400240200041406b1021450d002000280244450d0020002802402d000041c001490d010b10000b200041406b101a2204200028024422034b04401000200028024421030b2000280240210602400240027f027f024020030440410020062c00002201417f4a0d031a200141ff0171220241bf014b0d014100200141ff017141b801490d021a200241c97e6a0c020b410120060d021a410021010c030b4100200141ff017141f801490d001a200241897e6a0b41016a0b2105410021012003200449200420056a20034b720d004100210220032005490d01200520066a2102200320056b20042004417f461b22014109490d0110000c010b410021020b0340200104402001417f6a210120023100002007420886842107200241016a21020c010b0b0240024002400240024002402007500d0041c60a10302007510d0541cb0a10302007520d00200041306a102d2000410036024820004200370340200041406b41001031200041d4006a41003602002000420037024c41012102200041d8006a200041306a100f220328020420002d00582201410176200141017122041b2201450d0420014101470d012003280208200341016a20041b2c0000417f4a0d040c020b10000c040b200141384f0d010b200141016a21020c010b200141016a210203402001450d01200241016a2102200141087621010c000b000b20031011200041c8006a2802002002490440200041406b200210310b2000200041d8006a200041306a100f2201280208200141016a20002d0058220241017122031b36026820002001280204200241017620031b36026c20002000290368370300200041406b2000102b20011011200041cc006a2201280200200041d0006a28020047044010000b200028024020002802441003200128020022010440200041d0006a20013602000b20002802401a200041306a10110b200041f0006a24000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b3801017f2000280208200149044020011008200028020020002802041005210220002802001a200041086a2001360200200020023602000b0b3801017f41b00a420037020041b80a410036020041742100034020000440200041bc0a6a4100360200200041046a21000c010b0b410210150b0b20010041bc0a0b195761736d546573743200696e6974006765747265616c6c6f63";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GETREALLOC = "getrealloc";

    protected MemoryFunction_2(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected MemoryFunction_2(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<MemoryFunction_2> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(MemoryFunction_2.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<MemoryFunction_2> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(MemoryFunction_2.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<MemoryFunction_2> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(MemoryFunction_2.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<MemoryFunction_2> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(MemoryFunction_2.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<String> getrealloc() {
        final WasmFunction function = new WasmFunction(FUNC_GETREALLOC, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static MemoryFunction_2 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new MemoryFunction_2(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MemoryFunction_2 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new MemoryFunction_2(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
