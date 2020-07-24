package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Uint8;
import java.math.BigInteger;
import java.util.Arrays;
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
public class ReferenceDataTypeLinkedlistContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001601160027f7f0060017f0060017f017f60037f7f7f0060027f7f017f60037f7f7f017f60000060047f7f7f7f017f60047f7f7f7f0060027f7e0060037f7e7e0060037e7e7f006000017f60037f7e7e017f60017e017f60027e7e017f60017f017e02a9020d03656e760c706c61746f6e5f70616e6963000603656e760d726c705f6c6973745f73697a65000203656e760f706c61746f6e5f726c705f6c697374000303656e760e726c705f62797465735f73697a65000403656e7610706c61746f6e5f726c705f6279746573000303656e760d726c705f753132385f73697a65000f03656e760f706c61746f6e5f726c705f75313238000b03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000103656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000703656e7610706c61746f6e5f7365745f7374617465000803656e760d706c61746f6e5f72657475726e000003646306010002000004070001010103000304040700010201020002000602050301020010000200020100020001000002020001060702020201090000000001010503050e02000a0d00010404040100000000010502020005070105030503060302020408000405017001030305030100020608017f0141f088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000d0f5f5f66756e63735f6f6e5f65786974003e06696e766f6b6500270908010041010b020e170af37b63040010690b0300010bc00101037f230041306b2202240020004188026a220320032d000041016a3a0000200241086a10102104200220032d00003a0014200420011011024020004184016a280200220320004188016a22012802004704402003200241086a1012200020002802840141106a360284010c010b200241186a20004180016a220420032000280280016b410475220041016a10132000200110142200280208200241086a10122000200028020841106a360208200420001015200010160b200241306a24000b190020004200370200200041086a41003602002000102220000b8c0201047f20002001470440200128020420012d00002202410176200241017122041b2102200141016a210320012802082105410a21012005200320041b210420002d0000410171220304402000280200417e71417f6a21010b200220014d0440027f2003044020002802080c010b200041016a0b21012002044020012004200210660b200120026a41003a000020002d00004101710440200020023602040f0b200020024101743a00000f0b416f2103200141e6ffffff074d0440410b20014101742201200220022001491b220141106a4170712001410b491b21030b20031023220120042002106a200020023602042000200341017236020020002001360208200120026a41003a00000b0b130020002001101c1a200020012d000c3a000c0b3001017f2001200028020820002802006b2200410375220220022001491b41ffffffff00200041047541ffffff3f491b0b4c01017f2000410036020c200041106a2003360200200104402001102521040b200020043602002000200420024104746a22023602082000200420014104746a36020c2000200236020420000b900101027f200028020421022000280200210303402002200346450440200128020441706a200241706a220210262001200128020441706a3602040c010b0b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f20002802082101200028020421020340200120024704402000200141706a22013602080c010b0b0b2c01017f20004180016a2101410021000340200041f800470440200020016a10182000410c6a21000c010b0b0b0b002000200028020010240b9a0201077f230041306b22042400200141b0026a2109200141a8026a210703402006200120022d0000410c6c6a22054184016a28020020054180016a28020022056b4104754f0440200041003602082000420037020020012802ac0220012802a8026b2206044020002006410c6d101a20012802a80220012802ac02200041046a101b0b200441306a240005200441086a200520086a101c2105024020012802ac02220320012802b00247044020032005101c1a200120012802ac02410c6a3602ac020c010b200441186a2007200320072802006b410c6d220341016a101d20032009101e210320042802202005101c1a20042004280220410c6a36022020072003101f200310200b200841106a2108200641016a21060c010b0b0b2301017f200020011021220236020020002002360204200020022001410c6c6a3602080b2e000340200020014645044020022802002000101c1a20022002280200410c6a3602002000410c6a21000c010b0b0ba10101037f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b20012802082103024020012802042201410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712204102321022000200136020420002004410172360200200020023602080b200220032001106a200120026a41003a000020000b3101017f2001200028020820002802006b410c6d2200410174220220022001491b41d5aad5aa01200041aad5aad500491b0b4c01017f2000410036020c200041106a2003360200200104402001102121040b20002004360200200020042002410c6c6a2202360208200020042001410c6c6a36020c2000200236020420000baa0101037f200028020421022000280200210303402002200346450440200128020441746a2204200241746a2202290200370200200441086a200241086a280200360200200210222001200128020441746a3602040c010b0b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f20002802082101200028020421020340200120024704402000200141746a22013602080c010b0b0b09002000410c6c10230b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b0b002000410120001b10280b0900200020013602040b0900200041047410230b2a0020002001290200370200200041086a200141086a28020036020020011022200020012d000c3a000c0be20502057f017e23004190036b22002400106910072201102822021008200041d8006a200020022001102922034100102a200041d8006a102b02400240200041d8006a102c450d00200028025c450d0020002802582d000041c001490d010b10000b200041386a200041d8006a102d200028023c220141094f044010000b200028023821020340200104402001417f6a210120023100002005420886842105200241016a21020c010b0b024002402005500d00418008102e200551044020034101102f0c020b418508102e2005510440200041206a1010210120031030410247044010000b200041d8006a20034101102a200041d8006a20011031200041d8006a10322202200041386a2001101c100f200210330c020b419708102e2005510440200041003b001e2000411f6a210120031030410347044010000b20004101360238200020033602582000200041386a36025c200041d8006a2000411e6a1034200041d8006a20011034200041d8006a1032220320002d001e410c6c6a4180016a28020020002d001f4104746a2d000c2102200041206a10352101200041d0006a4100360200200041c8006a4200370300200041406b420037030020004200370338200041386a2002103620002802382104200041386a4104721037200120041038200120021039200128020c200141106a28020047044010000b20012802002001280204100c200128020c22020440200120023602100b200310330c020b41ab08102e200551044020034102102f0c020b41bc08102e2005520d0020031030410247044010000b200041d8006a20034101102a200041d8006a103a2101200041d8006a10322102200020013a001e200041206a20022000411e6a1019200041386a10352201200041206a103b10382001200041206a103c200128020c200141106a28020047044010000b20012802002001280204100c200128020c22030440200120033602100b200041206a103d200210330c010b10000b103e20004190036a24000b9b0101047f230041106b220124002001200036020c2000047f41e008200041086a2202411076220041e0082802006a220336020041dc0841dc08280200220420026a41076a417871220236020002400240200341107420024d044041e008200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104106741086a0541000b2100200141106a240020000b0c00200020012002411c103f0bc90202067f017e230041106b220324002001280208220520024b0440200341086a2001106f20012003280208200328020c106d36020c20032001106f410021052001027f410020032802002207450d001a410020032802042208200128020c2206490d001a200820062006417f461b210420070b360210200141146a2004360200200141003602080b200141106a210603402001280214210402402005200249044020040d01410021040b2000200628020020044114103f1a200341106a24000f0b20032001106f41002104027f410020032802002205450d001a410020032802042208200128020c2207490d001a200820076b2104200520076a0b2105200120043602142001200536021020032006410020052004106d106e2001200329030022093702102001200128020c2009422088a76a36020c2001200128020841016a22053602080c000b000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b980101037f200028020445044041000f0b2000102b200028020022022c0000220141004e044020014100470f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200028020441014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a2000280204200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0bd50101047f200110402204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b3901017f230041c0026b2202240020001030410147044010000b200241086a10322100200241086a200111010020001033200241c0026a24000b2501017f02402000280204450d0020002802002d000041c001490d002000104121010b20010bf40201057f230041206b22022400024002402000280204044020002802002d000041c001490d010b200241086a10101a0c010b200241186a2000102d2000104021030240024002400240200228021822000440200228021c220520034f0d010b41002100200241106a410036020020024200370308410021050c010b200241106a4100360200200242003703082000200520032003417f461b22046a21052004410a4b0d010b200220044101743a0008200241086a41017221030c010b200441106a4170712206102321032002200436020c20022006410172360208200220033602100b03402000200546450440200320002d00003a0000200341016a2103200041016a21000c010b0b200341003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141003602000b20012002290308370200200141086a200241106a280200360200200241086a1022200241206a24000bae10020a7f027e230041d0016b2201240020001042220410432004428ddd81f9d0bba3a73c37037820044180016a1043200141306a1035220520042903781044200528020c200541106a28020047044010000b0240200528020022002005280204220310092209450d002001410036022820014200370320200141206a2009104520002003200128022022082001280224220620086b100a417f4704400240200141086a200841016a20062008417f736a10292207280204044020072802002d000041bf014b0d010b10000b20071041410a47044010000b200141d0006a21004100210303402003410a4704402001410036025020014200370348200141e8006a20072003102a02400240200128026c450d0020012802682d000041c001490d00200141e8006a103021022001280250200128024822066b4104752002490440200141c8006a200141b8016a2002200128024c20066b4104752000101422021015200210160b200141a8016a200141e8006a104620014180016a200141e8006a1047034020012802ac0120012802840146044020012802b001200128028801460d030b20014190016a200141a8016a1048200141d8006a10102102200141b8016a20014190016a4100102a200141b8016a20021031200141b8016a20014190016a4101102a2001200141b8016a103a3a00640240200128024c220220012802504904402002200141d8006a10262001200128024c41106a36024c0c010b200141b8016a200141c8006a200220012802486b410475220241016a1013200220001014210220012802c001200141d8006a1026200120012802c00141106a3602c001200141c8006a20021015200210160b200141a8016a10490c000b000b10000b20042003410c6c6a22024180016a2206104a2006200128024836020020024184016a200129024c3702002001410036025020014200370348200341016a2103200141c8006a103d0c010b0b200921020b2008450d00200120083602240b200528020c22000440200520003602100b024020020d00410021000340200041f800460d010240200020046a220241046a2802002205200228020022066b410475220720024188016a220928020020024180016a220328020022086b4104754d0440200720024184016a220228020020086b41047522094b04402006200620094104746a22032008104b1a200320052002104c0c020b2003200620052008104b10240c010b2003104a200320032007101322081025220736020020024184016a220220073602002009200720084104746a360200200620052002104c0b2000410c6a21000c000b000b41002102200441003a00f80120044180026a220042db92e2f3d284bb854e370300200141b8016a1035220320002903001044200328020c200341106a28020047044010000b0240200328020022002003280204220510092207450d002001410036027020014200370368200141e8006a200710452000200520012802682206200128026c220820066b100a417f47044020014190016a200641016a20082006417f736a10292202102b024002402002102c450d002002280204450d0020022802002d000041c001490d010b10000b200141306a2002102d2001280234220241114f044010000b20012802302100034020020440200c420886200b42388884210c2002417f6a21022000310000200b42088684210b200041016a21000c010b0b20044200200b4201837d200b420188853c008802200721020b2006450d002001200636026c0b200328020c22000440200320003602100b2002450440200420042d00f8013a0088020b200442003702900241002102200441b0026a4100360200200441a8026a22034200370200200441a0026a2200428debc585c3a7f9dbf70037030020044198026a410036020020014190016a1035220520002903001044200528020c200541106a28020047044010000b200441ac026a2106024020052802002200200528020422071009220a450d002001410036028801200142003703800120014180016a200a1045200020072001280280012209200128028401220820096b100a417f47044002400240200141e8006a200941016a20082009417f736a10292202280204450d0020022802002d000041c001490d0020021030210020042802b00220042802a80222076b410c6d20004904402003200141b8016a200020042802ac0220076b410c6d200441b0026a101e2200101f200010200b200141086a20021046200141d8006a20021047200441b0026a21080340200128020c200128025c46044020012802102001280260460d030b200141b8016a200141086a1048200141b8016a200141a8016a101022001031024020042802ac02220220042802b002490440200220012903a801370200200241086a200141b0016a2802003602002000102220062006280200410c6a3602000c010b200141306a2003200220032802006b410c6d220241016a101d20022008101e21022001280238220720012903a801370200200741086a200141b0016a2802003602002000102220012001280238410c6a36023820032002101f200210200b200141086a10490c000b000b10000b200a21020b2009450d0020012009360284010b200528020c22000440200520003602100b024020020d00200428029402220720042802900222006b410c6d220520042802b00220042802a80222026b410c6d4d04402005200628020020026b410c6d22084b0440200020002008410c6c6a22032002104d1a200320072006101b0c020b2003200020072002104d10240c010b2002044020031018200441003602b002200442003702a8020b200320032005101d101a200020072006101b0b200141d0016a240020040bc30a020d7f027e23004180016b22022400200241e0006a10352203200041a0026a2201290300104e1038200320012903001044200041a8026a2104200328020c200341106a28020047044010000b2003280204210a20032802002107200241286a103521012004103b21082001200241106a104f220510502001200820052802046a20052802006b103820012004103c0240200128020c200141106a280200460440200141046a2104200128020021080c010b200141046a2104100020012802002108200128020c2001280210460d0010000b2007200a20082004280200100b200528020022040440200520043602040b200128020c22050440200120053602100b200328020c22010440200320013602100b200041a8026a103d20004190026a103d200241286a1035220120004180026a2203290300104e1038200120032903001044200128020c200141106a28020047044010000b200128020421042001280200210a200241106a10352103200241f8006a4100360200200241f0006a4200370300200241e8006a420037030020024200370360200241e0006a200030008802220e420186200e423f87220f85200f420186200e423f8884200f85105120022802602107200241e0006a41047210372003200241e0006a104f220510502003200720052802046a20052802006b103802402003200030008802220e420186200e423f87220f85200f420186200e423f8884200f851052220328020c200341106a280200460440200341046a2107200328020021080c010b200341046a2107100020032802002108200328020c2003280210460d0010000b200a200420082007280200100b200528020022040440200520043602040b200328020c22050440200320053602100b200128020c22030440200120033602100b200241286a103522092000290378104e1038200920002903781044200928020c200941106a28020047044010000b2009280204210c2009280200210d200241106a10352106200241f8006a4100360200200241f0006a4200370300200241e8006a420037030020024200370360200241e0006a41001053200041f8016a210820004180016a22072104034002402004200847044020042802002004280204460440200241e0006a10540c020b200241e0006a410010532004280204200428020022016b2103034020030440200241e0006a41001053200241e0006a200241d0006a2001101c1055220520012d000c1036200541011053200341706a2103200141106a21010c0105200241e0006a410110530c030b000b000b200241e0006a4101105320022802602101200241e0006a410472220a103720062002104f220b105020062001200b2802046a200b2802006b10382006410a105621060340200720084704402006200728020420072802006b410475105621042007280204200728020022016b2103034020030440200441021056210520024100360278200242003703702002420037036820024200370360200241e0006a200241d0006a2001101c105520012d000c10362005200228026010382005200241406b2001101c105720012d000c1039200a1037200341706a2103200141106a21010c010b0b2007410c6a21070c010b0b0240200628020c200641106a280200460440200641046a2101200628020021030c010b200641046a2101100020062802002103200628020c2006280210460d0010000b200d200c20032001280200100b200b28020022010440200b20013602040b200628020c22010440200620013602100b200928020c22010440200920013602100b20004180016a10582000105820024180016a24000f0b2004410c6a21040c000b000b4601017f230041206b22022400200241086a20002802002000280204280200102a2001200241086a103a3a000020002802042200200028020041016a360200200241206a24000b29002000410036020820004200370200200041001059200041146a41003602002000420037020c20000b0b0020002001ad420010510bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a2000105a200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b20002001105b200441106a24000b1300200028020820014904402000200110590b0b0c0020002001ad420010521a0b7d01037f230041106b220124002000102b024002402000102c450d002000280204450d0020002802002d000041c001490d010b10000b200141086a2000102d200128020c220041024f044010000b200128020821020340200004402000417f6a210020022d00002103200241016a21020c010b0b200141106a240020030b9d0101027f230041306b22012400200141186a4100360200200141106a4200370300200141086a420037030020014200370300024020002802002000280204460440200110540c010b2001410010532000280204210220002802002100034020002002460440200141011053052001200141206a2000101c10551a2000410c6a21000c010b0b0b2001280200210020014104721037200141306a240020000b5601027f230041106b220224002000200128020420012802006b410c6d105621032001280204210020012802002101034020002001460440200241106a240005200320022001101c10571a2001410c6a21010c010b0b0b0e0020002802000440200010180b0b880101037f41cc08410136020041d0082802002100034020000440034041d40841d4082802002201417f6a2202360200200141014845044041cc084100360200200020024102746a22004184016a280200200041046a28020011010041cc08410136020041d00828020021000c010b0b41d408412036020041d008200028020022003602000c010b0b0b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000106b20024f0d002003410471044010000c010b200042003702000b02402003411071450d002000106b20024d0d0020034104710440100020000f0b200042003702000b20000bff0201037f200028020445044041000f0b2000102b41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a2000106f200128020c210003402000450d01200141002001280208220320032000106d22046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020bc90201037f200041003a0000200041f8006a2202417f6a41003a0000200041003a0002200041003a00012002417d6a41003a00002002417e6a41003a0000200041003a00032002417c6a41003a00002000410020006b41037122016a22024100360200200241f80020016b417c7122016a2203417c6a4100360200024020014109490d002002410036020820024100360204200341786a4100360200200341746a410036020020014119490d002002410036021820024100360214200241003602102002410036020c200341706a41003602002003416c6a4100360200200341686a4100360200200341646a41003602002001200241047141187222016b2103200120026a2101034020034120490d0120014200370300200141186a4200370300200141106a4200370300200141086a4200370300200141206a2101200341606a21030c000b000b20000b2c01017f200041f8006a2101034020004200370200200041086a41003602002000410c6a22002001470d000b0b0b0020002001420010521a0bfd0101067f024020002802042202200028020022046b220520014904402000280208220720026b200120056b22034f04400340200241003a00002000200028020441016a22023602042003417f6a22030d000c030b000b2001200720046b2202410174220420042001491b41ffffffff07200241ffffffff03491b220104402001102321060b200520066a220521020340200241003a0000200241016a21022003417f6a22030d000b200120066a210420052000280204200028020022066b22016b2103200141014e044020032006200110671a0b2000200436020820002002360204200020033602000f0b200520014d0d002000200120046a3602040b0b0a0020002001410110680b0a0020002001410010680b160020002001280204200141086a280200411c103f1a0bb50102057f017e230041106b22032400200041046a210102402000280200220204402001280200220504402005200041086a2802006a21040b20002004360204200041086a2002360200200341086a2001410020042002106d106e20002003290308220637020420004100200028020022012006422088a76b2202200220014b1b3602000c010b200020012802002201047f2001200041086a2802006a0541000b360204200041086a41003602000b200341106a24000b1c00200028020004402000101820004100360208200042003702000b0b3600034020002001464504402002200010112002410c6a2000410c6a2d00003a0000200041106a2100200241106a21020c010b0b20020b2d00034020002001464504402002280200200010122002200228020041106a360200200041106a21000c010b0b0b2600034020002001464504402002200010112002410c6a21022000410c6a21000c010b0b20020b5101027f230041206b22012400200141186a4100360200200141106a4200370300200141086a42003703002001420037030020012000420010512001280200210220014104721037200141206a240020020b3a01017f20004100360208200042003702002000410110232201360200200141fe013a00002000200141016a22013602082000200136020420000b6101037f200028020c200041106a28020047044010000b200028020422022001280204200128020022036b22016a220420002802084b047f20002004105920002802040520020b20002802006a2003200110671a2000200028020420016a3602040b890101027f4101210420014280015441002002501b450440034020012002845045044020024238862001420888842101200341016a2103200242088821020c010b0b200341384f047f2003106020036a0520030b41016a21040b200041186a28020022030440200041086a280200200041146a2802002003105e21000b2000200028020020046a3602000b2a01017f2000200220011005200028020422036a105c20022001200320002802006a10062000105d20000bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a22022802002203105e280200210120022003417f6a3602002007105f4180104f044020072000410c6a280200417c6a105b0b200141384f047f2001106020016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002105e21000c010b02402007105f0d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a10610c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010232105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a1062220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a10632102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021064200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a106522013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a10632102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c2002200937020820021064200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a10610c010b20042001410175410120011b200320051063210241802010232106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a106222013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200106321032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b20022902002109200220032902003702002003200937020020022902082109200220032902083702082003200937020820031064200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c2002200937020820021064052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a106522013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210106321062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a37032020061064200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a2007105a200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000b3901017f027f200041186a28020022010440200041086a280200200041146a2802002001105e0c010b20000b2201200128020041016a3602000ba10101037f41012103024002400240200128020420012d00002202410176200241017122041b220241014d0440200241016b0d032001280208200141016a20041b2c0000417f4c0d010c030b200241374b0d010b200241016a21030c010b2002106020026a41016a21030b027f200041186a28020022010440200041086a280200200041146a2802002001105e0c010b20000b2201200128020020036a36020020000b9d0201057f2001044020002802042105200041106a2802002202200041146a280200220349044020022001ad2005ad422086843702002000200028021041086a36021020000f0b027f41002002200028020c22046b410375220641016a2202200320046b2203410275220420042002491b41ffffffff01200341037541ffffffff00491b2204450d001a200441037410230b2102200220064103746a22032001ad2005ad4220868437020020032000280210200028020c22066b22016b2105200220044103746a2102200341086a2103200141014e044020052006200110671a0b20002002360214200020033602102000200536020c20000f0b200041001001200028020422016a105c41004100200120002802006a10022000105d20000b4e01037f20002001280208200141016a20012d0000220241017122031b22042001280204200241017620031b22011003200028020422026a105c20042001200220002802006a10042000105d20000b1f01017f41ec0021010340200020016a103d200141746a22014174470d000b0b2f01017f2000280208200149044020011028200028020020002802041067210220002001360208200020023602000b0b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b3601017f2000280208200149044020011028200028020020002802041067210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210016a105c200120002802006a22012002200110020c010b0b0b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a106222023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a10632103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b20002902002107200020032902003702002003200737020020002902082107200020032902083702082003200737020820031064200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110660b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274102321040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110660b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210671a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000be50101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001106f20004100200428020c2201200428020822022001106d22032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a24000b3501017f230041106b220041f0880436020c41d808200028020c41076a417871220036020041dc08200036020041e0083f003602000b10002002044020002001200210671a0b0b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000106c200010406a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b2701017f230041206b22022400200241086a200020014114103f106b2100200241206a240020000b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b2101017f20011040220220012802044b044010000b200020012001106c2002106e0b0b5201004180080b4b696e697400696e736572744e6f6465456c656d656e74006765744e6f6465456c656d656e74496e64657800636c6561724e6f6465456c656d656e740066696e644e6f6465456c656d656e74";

    public static String BINARY = BINARY_0;

    public static final String FUNC_INSERTNODEELEMENT = "insertNodeElement";

    public static final String FUNC_GETNODEELEMENTINDEX = "getNodeElementIndex";

    public static final String FUNC_CLEARNODEELEMENT = "clearNodeElement";

    public static final String FUNC_FINDNODEELEMENT = "findNodeElement";

    protected ReferenceDataTypeLinkedlistContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected ReferenceDataTypeLinkedlistContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<TransactionReceipt> insertNodeElement(String nodeData) {
        final WasmFunction function = new WasmFunction(FUNC_INSERTNODEELEMENT, Arrays.asList(nodeData), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> insertNodeElement(String nodeData, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_INSERTNODEELEMENT, Arrays.asList(nodeData), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<ReferenceDataTypeLinkedlistContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeLinkedlistContract.class, web3j, credentials, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<ReferenceDataTypeLinkedlistContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeLinkedlistContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<ReferenceDataTypeLinkedlistContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeLinkedlistContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public static RemoteCall<ReferenceDataTypeLinkedlistContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ReferenceDataTypeLinkedlistContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public RemoteCall<Uint8> getNodeElementIndex(Uint8 arrayIndex, Uint8 vectorIndex) {
        final WasmFunction function = new WasmFunction(FUNC_GETNODEELEMENTINDEX, Arrays.asList(arrayIndex,vectorIndex), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public RemoteCall<TransactionReceipt> clearNodeElement() {
        final WasmFunction function = new WasmFunction(FUNC_CLEARNODEELEMENT, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> clearNodeElement(BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_CLEARNODEELEMENT, Arrays.asList(), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<String[]> findNodeElement(Uint8 index) {
        final WasmFunction function = new WasmFunction(FUNC_FINDNODEELEMENT, Arrays.asList(index), String[].class);
        return executeRemoteCall(function, String[].class);
    }

    public static ReferenceDataTypeLinkedlistContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new ReferenceDataTypeLinkedlistContract(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static ReferenceDataTypeLinkedlistContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new ReferenceDataTypeLinkedlistContract(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
