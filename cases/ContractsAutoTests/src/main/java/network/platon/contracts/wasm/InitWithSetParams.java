package network.platon.contracts.wasm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
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
 * <p>Generated with platon-web3j version 0.13.1.1.
 */
public class InitWithSetParams extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000014e0e60027f7f0060017f017f60017f0060037f7f7f017f60037f7f7f0060000060027f7f017f60047f7f7f7f0060047f7f7f7f017f60027f7e0060037e7e7f006000017f60027e7e017f60017f017e02a9020d03656e760c706c61746f6e5f70616e6963000503656e760d726c705f6c6973745f73697a65000103656e760f706c61746f6e5f726c705f6c697374000403656e760e726c705f62797465735f73697a65000603656e7610706c61746f6e5f726c705f6279746573000403656e760d726c705f753132385f73697a65000c03656e760f706c61746f6e5f726c705f75313238000a03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000b03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000603656e7610706c61746f6e5f6765745f7374617465000803656e7610706c61746f6e5f7365745f7374617465000703656e760d706c61746f6e5f72657475726e0000033f3e05000006060304070100020201040401030501030402000d00010101010000020508010000060900000102030002000003010003080203030102050101070405017001030305030100020608017f0141b088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000d0f5f5f66756e63735f6f6e5f65786974002d06696e766f6b65001e0908010041010b020e0e0ab25a3e040010470b0b00200041186a2001100f0bdc0401087f230041206b22062400024020002001460d00200141046a21092001280200210102402000280208450d00200028020021042000200041046a3602002000410036020820002802042102200041003602042002410036020820042802042202200420021b2102034020022204450d0120012009470440200441106a2105024020012004460d00200128021420012d00102202410176200241017122081b2102410a21032001280218200141116a20081b210820052d0000410171220704402005280200417e71417f6a21030b200220034d0440027f20070440200441186a2802000c010b200541016a0b210320020440200320082002101a0b200220036a41003a000020052d00004101710440200441146a20023602000c020b200520024101743a00000c010b416f2107200341e6ffffff074d0440410b20034101742203200220022003491b220341106a4170712003410b491b21070b20071019220320082002101b200441146a200236020020042007410172360210200441186a2003360200200220036a41003a00000b024020042802082202450440410021020c010b2004200228020022034604402002410036020020022802042203450d012003101c21020c010b200241003602042003450d002003101c21020b2000200641106a2005101d2105200020062802102005200410142001101521010c010b0b0340200428020822040d000b200921010b034020012009460d01200641106a2000200141106a101320002006410c6a2006280210220441106a101d21022000200628020c2002200410142001101521010c000b000b200641206a24000b8c0201087f230041106b22022400200042003702042000200041046a2204360200200141046a210920012802002105034020052009470440200541106a2106200028020421080240027f027f0240024020042000280200460440200421010c010b20042107024020082203044003402003220128020422030d000c020b000b03402007280208220128020020074621032001210720030d000b0b200141106a20061011450d010b20084504402002200436020c200422010c030b2002200136020c200141046a0c010b20002002410c6a200610120b22012802000d01200228020c0b21032002200020061013200020032001200228020010140b2005101521050c010b0b200241106a240020000bb20101067f02400240200128020420012d00002202410176200241017122031b2205200028020420002d00002202410176200241017122041b2206200520064922071b2202450d002000280208200041016a20041b21002001280208200141016a20031b210103402002450d0120002d0000220320012d00002204460440200141016a2101200041016a21002002417f6a21020c010b0b200320046b22020d010b417f200720062005491b21020b2002411f760b890101027f200041046a2103024020002802042200044002400340024002402002200041106a220410110440200028020022040d012001200036020020000f0b200420021011450d03200041046a210320002802042204450d01200321000b20002103200421000c010b0b2001200036020020030f0b200120003602000c010b200120033602000b20030b2c01017f2000411c101922033602002000200141046a360204200341106a20021016200041086a41013a00000baf0201027f20032001360208200342003702002002200336020020002802002802002201044020002001360200200228020021030b2003200320002802042205463a000c03400240024020032005460d00200328020822012d000c0d002001200128020822022802002204460440024020022802042204450d0020042d000c0d002004410c6a21030c030b20032001280200470440200110172001280208220128020821020b200141013a000c200241003a000c200210180c010b02402004450d0020042d000c0d002004410c6a21030c020b20032001280200460440200110182001280208220128020821020b200141013a000c200241003a000c200210170b2000200028020841016a3602080f0b200141013a000c200220022005463a000c200341013a0000200221030c000b000b3601017f024020002802042201044003402001220028020022010d000c020b000b0340200020002802082200280200470d000b0b20000b9d0101037f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a2802003602000f0b20012802082103024020012802042201410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712204101921022000200136020420002004410172360200200020023602080b200220032001101b200120026a41003a00000b5101027f200020002802042201280200220236020420020440200220003602080b200120002802083602082000280208220220022802002000474102746a200136020020002001360208200120003602000b5101027f200020002802002201280204220236020020020440200220003602080b200120002802083602082000280208220220022802002000474102746a200136020020002001360208200120003602040b0b002000410120001b101f0b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210381a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b10002002044020002001200210381a0b0b1d01017f03402000220128020022000d00200128020422000d000b20010b5c01017f0240200028020422030440034002402002200341106a1011044020032802002200450d040c010b200328020422000d0020012003360200200341046a0f0b200021030c000b000b200041046a21030b2001200336020020030be20302057f017e230041f0006b22002400104710072201101f22021008200041206a200041086a200220011020220341001021200041206a1022024002402000280224450d00200041206a10220240200028022022022c0000220141004e044020010d010c020b200141807f460d00200141ff0171220441b7014d0440200028022441014d04401000200028022021020b20022d00010d010c020b200441bf014b0d012000280224200141ff017141ca7e6a22014d04401000200028022021020b200120026a2d0000450d010b2000280224450d0020022d000041c001490d010b10000b200041d8006a200041206a1023200028025c220141094f044010000b200028025821020340200104402001417f6a210120023100002005420886842105200241016a21020c010b0b024002402005500d00418008102420055104402003410110250c020b418508102420055104402003410210250c020b418d0810242005520d0020031026410147044010000b200041206a10272103200041c8006a200041386a10102102200041d8006a1028220120021029102a20012002102b200128020c200141106a28020047044010000b20012802002001280204100c200128020c22020440200120023602100b2003102c0c010b10000b102d200041f0006a24000b9b0101047f230041106b220124002001200036020c2000047f41ac08200041086a2202411076220041ac082802006a220336020041a80841a808280200220420026a41076a417871220236020002400240200341107420024d044041ac08200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104103841086a0541000b2100200141106a240020000b0c00200020012002411c102e0bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001103120012003280208200328020c103236020c200320011031410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b2000200628020020044114102e1a200341106a24000f0b20032001103141002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b21052001200436021420012005360210200320064100200520041032104a2001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bd50101047f2001102f2204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b7001017f230041d0006b22022400200242003702342002200241306a41047236023020001026410247044010000b200241086a200041011021200241086a200241306a1030200241086a10272100200241086a200241406b200241306a101020011100002000102c200241d0006a24000b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001031200128020c210003402000450d01200141002001280208220320032000103222046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020bfc0101087f230041306b2205240020004200370204200042aaada1d1e0bbb19d997f3703102000411c6a220142003702002000200041046a36020020002001360218200541186a1028220220002903101033200228020c200241106a28020047044010000b200041186a210602400240200228020022072002280204220810092204450d00200410192103410021010340200120036a41003a00002004200141016a2201470d000b2007200820032001100a417f460d002005200341016a200120036a2003417f736a1020200610300c010b410021040b200228020c22010440200220013602100b200445044020062000100f0b200541306a240020000b29002000410036020820004200370200200041001034200041146a41003602002000420037020c20000bcd0201067f230041306b22012400200141186a4100360200200141106a4200370300200141086a420037030020014200370300027f20002802084504402001410136020041010c010b200141001035200041046a2104200141206a410172210520002802002100037f2000200446047f200141011035200128020005200141206a200041106a101641012103024002400240200128022420012d00202202410176200241017122061b220241014d0440200241016b0d032001280228200520061b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002103620026a41016a21030b027f200120012802182202450d001a2001280208200220012802146a417f6a220241087641fcffff07716a280200200241ff07714102746a0b2202200228020020036a3602002000101521000c010b0b0b210020014104721037200141306a240020000b1300200028020820014904402000200110340b0ba80301077f230041106b22072400024020012802082202044020002802042105200041106a2802002203200041146a280200220449044020032002ad2005ad422086843702002000200028021041086a3602100c020b027f41002003200028020c22066b410375220841016a2203200420066b2204410275220620062003491b41ffffffff01200441037541ffffffff00491b2206450d001a200641037410190b2103200320084103746a22042002ad2005ad4220868437020020042000280210200028020c22086b22026b2105200320064103746a2103200441086a2104200241014e044020052008200210381a0b20002003360214200020043602102000200536020c0c010b200041001001200028020422026a103941004100200220002802006a10022000103a0b200141046a21042007410172210620012802002101034020012004460440200741106a2400052007200141106a101620002007280208200620072d0000220241017122051b22032007280204200241017620051b22021003200028020422056a103920032002200520002802006a10042000103a2001101521010c010b0b0bbe0302097f027e230041406a22032400200341086a10282104200341386a4100360200200341306a4200370300200341286a420037030020034200370320410121022000290310220a4280015a04400340200a200b8450450440200b423886200a42088884210a200141016a2101200b420888210b0c010b0b200141384f047f2001103620016a0520010b41016a21020b20032002360220200341206a410472103720042002102a200420002903101033200428020c200441106a28020047044010000b2004280204210520042802002106200341206a10282101200041186a22001029210741011019220241fe013a0000200128020c200141106a28020047044010000b2001280204220841016a220920012802084b047f20012009103420012802040520080b20012802006a2002410110381a2001200128020441016a3602042001200241016a200720026b6a102a20012000102b0240200128020c2001280210460440200128020021020c010b100020012802002102200128020c2001280210460d0010000b2006200520022001280204100b200128020c22020440200120023602100b200428020c22010440200420013602100b200341406b24000b880101037f4198084101360200419c082802002100034020000440034041a00841a0082802002201417f6a220236020020014101484504404198084100360200200020024102746a22004184016a280200200041046a2802001102004198084101360200419c0828020021000c010b0b41a0084120360200419c08200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000104820024f0d002003410471044010000c010b200042003702000b02402003411071450d002000104820024d0d0020034104710440100020000f0b200042003702000b20000bff0201037f200028020445044041000f0b2000102241012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020bd70501097f230041e0006b22022400024002402000280204450d0020002802002d000041c001490d00200241386a2000410110442104200241286a200041001044210820042802042100200241c8006a4101722109034020082802042000464100200428020822032008280208461b0d02200241106a20002003411c102e2100200210452107024002402002280214044020022802102d000041c001490d010b200241c8006a10451a0c010b200241d8006a200010232000102f21030240024002400240200228025822000440200228025c220520034f0d010b41002100200241d0006a41003602002002420037034841002106410021050c010b200241d0006a4100360200200242003703482000200520032003417f461b22066a21052006410a4b0d010b200220064101743a0048200921030c010b200641106a417071220a101921032002200636024c2002200a410172360248200220033602500b034020002005470440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020022d0000410171450440200241003b01000c010b200228020841003a00002002410036020420022d0000410171450d00200241003602000b200241086a2200200241d0006a28020036020020022002290348370300200241c8006a10462001200241c8006a200710122203280200450440411c101922052002290300370210200541186a200028020036020020071046200120022802482003200510140b20042004280204220020042802086a410020001b22003602042004280200220304402004200336020820002003103221052004027f200428020422074504404100210341000c010b410021034100200428020822062005490d001a200620052005417f461b210320070b2200ad2003ad42208684370204200441002004280200220520036b2203200320054b1b3602000c0105200441003602080c010b000b000b10000b200241e0006a24000b2101017f2001102f220220012802044b044010000b20002001200110492002104a0b2701017f230041206b22022400200241086a200020014114102e10482100200241206a240020000b2801017f2000420020011005200028020422026a103942002001200220002802006a10062000103a0b2f01017f200028020820014904402001101f200028020020002802041038210220002001360208200020023602000b0bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a22022802002203103d280200210120022003417f6a3602002007103e4180104f044020072000410c6a280200417c6a103c0b200141384f047f2001103620016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002103d21000c010b02402007103e0d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a103f0c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010192105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a1040220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a10412102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021042200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a104322013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a10412102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021042200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a103f0c010b20042001410175410120011b200320051041210241802010192106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a104022013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200104121032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b20022902002109200220032902003702002003200937020020022902082109200220032902083702082003200937020820031042200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c2002200937020820021042052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a104322013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210104121062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a37032020061042200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a2007103b200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000b1e01017f03402000044020004108762100200141016a21010c010b0b20010bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a2000103b200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b20002001103c200441106a24000bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b3601017f200028020820014904402001101f200028020020002802041038210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210016a1039200120002802006a22012002200110020c010b0b0b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a104022023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a10412103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b20002902002107200020032902003702002003200737020020002902082107200020032902083702082003200737020820031042200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b2201410275210320010440200220002001101a0b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274101921040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b220220002001101a0b20020be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001103120004100200428020c2201200428020822022001103222032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000b190020004200370200200041086a41003602002000104620000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b3501017f230041106b220041b0880436020c41a408200028020c41076a417871220036020041a808200036020041ac083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f200010492000102f6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0b1b01004180080b14696e6974006164645f736574006765745f736574";

    public static String BINARY = BINARY_0;

    public static final String FUNC_ADD_SET = "add_set";

    public static final String FUNC_GET_SET = "get_set";

    protected InitWithSetParams(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected InitWithSetParams(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static RemoteCall<InitWithSetParams> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId, Set<String> inSet) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList(inSet));
        return deployRemoteCall(InitWithSetParams.class, web3j, credentials, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<InitWithSetParams> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId, Set<String> inSet) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList(inSet));
        return deployRemoteCall(InitWithSetParams.class, web3j, transactionManager, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<InitWithSetParams> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId, Set<String> inSet) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList(inSet));
        return deployRemoteCall(InitWithSetParams.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public static RemoteCall<InitWithSetParams> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId, Set<String> inSet) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList(inSet));
        return deployRemoteCall(InitWithSetParams.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public RemoteCall<TransactionReceipt> add_set(Set<String> inSet) {
        final WasmFunction function = new WasmFunction(FUNC_ADD_SET, Arrays.asList(inSet), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> add_set(Set<String> inSet, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_ADD_SET, Arrays.asList(inSet), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Set> get_set() {
        final WasmFunction function = new WasmFunction(FUNC_GET_SET, Arrays.asList(), Set.class, 
                new com.platon.rlp.ParameterizedTypeImpl(
                new java.lang.reflect.Type[] {java.lang.String.class}, 
                java.util.Set.class, 
                java.util.Set.class));
        return executeRemoteCall(function, Set.class);
    }

    public static InitWithSetParams load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new InitWithSetParams(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static InitWithSetParams load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new InitWithSetParams(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
