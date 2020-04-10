package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Uint64;
import com.platon.rlp.datatypes.Uint8;
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
public class ContractCallPrecompile extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001691060027f7f0060017f0060017f017f60000060037f7f7f0060077f7f7f7f7f7e7e0060057f7f7f7e7e0060027f7f017f60037f7f7f017f60047f7f7f7f006000017f60017f017e60077f7f7f7f7f7f7f0060027f7e0060047f7f7f7f017f60077f7f7f7f7f7f7f017f02b0010703656e760c706c61746f6e5f70616e6963000303656e761d706c61746f6e5f6765745f63616c6c5f6f75747075745f6c656e677468000a03656e7616706c61746f6e5f6765745f63616c6c5f6f7574707574000103656e760b706c61746f6e5f63616c6c000f03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000a03656e7610706c61746f6e5f6765745f696e707574000103656e760d706c61746f6e5f72657475726e000003515003080803020202080303070404010c04090001020301010802020202090004020102040000020000000004000107000105000407070e00070001000d060200060605050506030b0b00000001000000000405017001090905030100020615037f0141e08e040b7f0041e08e040b7f0041de0e0b075406066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300070b5f5f686561705f6261736503010a5f5f646174615f656e6403020f5f5f66756e63735f6f6e5f65786974001b06696e766f6b65004c090e010041010b081d434647484a4b330ad669501800100a41a40a101a1a4101101c41b00a101a1a4108101c0ba20a010d7f2002410f6a210f410020026b21072002410e6a210a410120026b210e2002410d6a210d410220026b210c0340200020056a2103200120056a220441037145200220054672450440200320042d00003a0000200f417f6a210f200741016a2107200a417f6a210a200e41016a210e200d417f6a210d200c41016a210c200541016a21050c010b0b200220056b210602400240024002402003410371220b044020064120490d03200b4101460d01200b4102460d02200b4103470d032003200120056a280200220a3a0000200041016a210b200220056b417f6a210c200521030340200c4113494504402003200b6a2208200120036a220941046a2802002206411874200a41087672360200200841046a200941086a2802002204411874200641087672360200200841086a2009410c6a28020022064118742004410876723602002008410c6a200941106a280200220a411874200641087672360200200341106a2103200c41706a210c0c010b0b2002417f6a2007416d2007416d4b1b200f6a4170716b20056b2106200120036a41016a2104200020036a41016a21030c030b2006210403402004411049450440200020056a2203200120056a2202290200370200200341086a200241086a290200370200200541106a2105200441706a21040c010b0b027f2006410871450440200120056a2104200020056a0c010b200020056a2202200120056a2201290200370200200141086a2104200241086a0b21052006410471044020052004280200360200200441046a2104200541046a21050b20064102710440200520042f00003b0000200441026a2104200541026a21050b2006410171450d03200520042d00003a000020000f0b2003200120056a2206280200220a3a0000200341016a200641016a2f00003b0000200041036a210b200220056b417d6a210720052103034020074111494504402003200b6a2208200120036a220941046a2802002206410874200a41187672360200200841046a200941086a2802002204410874200641187672360200200841086a2009410c6a28020022064108742004411876723602002008410c6a200941106a280200220a410874200641187672360200200341106a2103200741706a21070c010b0b2002417d6a200c416f200c416f4b1b200d6a4170716b20056b2106200120036a41036a2104200020036a41036a21030c010b2003200120056a2206280200220d3a0000200341016a200641016a2d00003a0000200041026a210b200220056b417e6a210720052103034020074112494504402003200b6a2208200120036a220941046a2802002206411074200d41107672360200200841046a200941086a2802002204411074200641107672360200200841086a2009410c6a28020022064110742004411076723602002008410c6a200941106a280200220d411074200641107672360200200341106a2103200741706a21070c010b0b2002417e6a200e416e200e416e4b1b200a6a4170716b20056b2106200120036a41026a2104200020036a41026a21030b20064110710440200320042d00003a00002003200428000136000120032004290005370005200320042f000d3b000d200320042d000f3a000f200441106a2104200341106a21030b2006410871044020032004290000370000200441086a2104200341086a21030b2006410471044020032004280000360000200441046a2104200341046a21030b20064102710440200320042f00003b0000200441026a2104200341026a21030b2006410171450d00200320042d00003a00000b20000bfc0202027f017e02402002450d00200020013a0000200020026a2203417f6a20013a000020024103490d00200020013a0002200020013a00012003417d6a20013a00002003417e6a20013a000020024107490d00200020013a00032003417c6a20013a000020024109490d002000410020006b41037122046a2203200141ff017141818284086c22013602002003200220046b417c7122046a2202417c6a200136020020044109490d002003200136020820032001360204200241786a2001360200200241746a200136020020044119490d002003200136021820032001360214200320013602102003200136020c200241706a20013602002002416c6a2001360200200241686a2001360200200241646a20013602002001ad220542208620058421052004200341047141187222016b2102200120036a2101034020024120490d0120012005370300200141186a2005370300200141106a2005370300200141086a2005370300200141206a2101200241606a21020c000b000b20000b3501017f230041106b220041e08e0436020c418408200028020c41076a41787122003602004180082000360200418c083f003602000b9f0101047f230041106b220224002002200036020c027f02400240024020000440418c08200041086a22014110762200418c082802006a2203360200418408200141840828020022016a41076a4178712204360200200341107420044d0d0120000d020c030b41000c030b418c08200341016a360200200041016a21000b200040000d0010000b20012002410c6a410410081a200141086a0b200241106a24000b2f01027f2000410120001b2100034002402000100b22010d004190082802002202450d0020021103000c010b0b20010b7801027f20002101024003402001410371044020012d0000450d02200141016a21010c010b0b2001417c6a21010340200141046a22012802002202417f73200241fffdfb776a7141808182847871450d000b0340200241ff0171450d01200141016a2d00002102200141016a21010c000b000b200120006b0bc10301067f024020002001460d00027f02400240200120006b20026b410020024101746b4b044020002001734103712103200020014f0d012003450d0220000c030b20002001200210080f0b024020030d002001417f6a21030340200020026a220441037104402002450d052004417f6a200220036a2d00003a00002002417f6a21020c010b0b2000417c6a21032001417c6a2104034020024104490d01200220036a200220046a2802003602002002417c6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200241046a21062002417f73210503400240200120046a2107200020046a2208410371450d0020022004460d03200820072d00003a00002006417f6a2106200541016a2105200441016a21040c010b0b200220046b21014100210303402001410449450440200320086a200320076a280200360200200341046a21032001417c6a21010c010b0b200320076a210120022005417c2005417c4b1b20066a417c716b20046b2102200320086a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b20000b0a0041940841013602000b0a0041940841003602000b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204101220000b6401027f2002417049044002402002410a4d0440200020024101743a0000200041016a21030c010b200241106a4170712204100c21032000200236020420002004410172360200200020033602080b2003200120021013200220036a41003a00000f0b000b13002002047f20002001200210080520000b1a0b130020002d0000410171044020002802081a0b0bb70101027f416e20016b20024f0440027f200041016a20002d0000410171450d001a20002802080b2108027f416f200141e6ffffff074b0d001a410b20014101742207200120026a220220022007491b2202410b490d001a200241106a4170710b2207100c21022005044020022006200510130b200320046b220322060440200220056a200420086a200610130b200020023602082000200320056a220136020420002007410172360200200120026a41003a00000f0b000b13002002047f200020012002100e0520000b1a0be30201057f027f20002d00002205410171220445044020054101760c010b20002802040b220641004f04402006200120062001491b2101410a2105200404402000280200417e71417f6a21050b200120066b20056a200349044020002005200320066a20016b20056b200620012003200210150f0b2004047f200028020805200041016a0b21040240024020012003460440200321010c010b200620016b2207450d00200120034b04402004200220031016200320046a200120046a200710160c020b0240200420066a20024d200420024f720d00200120046a20024b04402004200220011016200320016b200220036a2102200121084100210121030c010b2002200320016b6a21020b200420086a220520036a200120056a200710160b200420086a2002200310160b200320016b20066a2101024020002d0000410171450440200020014101743a00000c010b200020013602040b200120046a41003a00000f0b000b6d01027f2001417049044002402001410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712203100c21022000200136020420002003410172360200200020023602080b2001047f20024130200110090520020b1a200120026a41003a00000f0b000b2301017f03402001410c46450440200020016a4100360200200141046a21010c010b0b0b190020004200370200200041086a41003602002000101920000b7601037f100f41980828020021000340200004400340419c08419c082802002201417f6a22023602002001410148450440200020024102746a22004184016a280200200041046a2802001010110100100f41980828020021000c010b0b419c084120360200419808200028020022003602000c010b0b0b960101027f100f419808280200220145044041980841a00836020041a00821010b0240419c0828020022024120460440418402100b220104402001410041840210091a0b2001450d0120014198082802003602004198082001360200419c084100360200410021020b419c08200241016a360200200120024102746a22014184016a4100360200200141046a200036020010100f0b10100b070041a40a10140b780020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000101f20012802044f0d002002410471450440200042003702000c010b10000b024002402002411071450d002000101f20012802044d0d0020024104710d01200042003702000b20000f0b100020000b290002402000280204044020002802002c0000417f4c0d0141010f0b41000f0b20001020200010216a0b240002402000280204450d0020002802002c0000417f4c0d0041000f0b2000102641016a0b8a0301047f0240024020002802040440200010274101210220002802002c00002201417f4c0d010c020b41000f0b200141ff0171220241b7014d0440200241807f6a0f0b02400240200141ff0171220141bf014d04400240200041046a22042802002201200241c97e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b200241384f0d010c020b200141f7014d0440200241c07e6a0f0b0240200041046a22042802002201200241897e6a22034d047f100020042802000520010b4102490d0020002802002d00010d0010000b200341054f044010000b20002802002d000145044010000b410021024100210103402001200346450440200028020020016a41016a2d00002002410874722102200141016a21010c010b0b20024138490d010b200241ff7d490d010b100020020f0b20020b3902017f017e230041306b2201240020012000290200220237031020012002370308200141186a200141086a4114101e101f200141306a24000b5e01027f2000027f027f2001280200220504404100200220036a200128020422014b2001200249720d011a410020012003490d021a200220056a2104200120026b20032003417f461b0c020b41000b210441000b360204200020043602000b2101017f20011021220220012802044b044010000b2000200120011020200210230b900302097f017e230041406a220324002001280208220520024b0440200341386a20011024200320032903383703182001200341186a102236020c200341306a20011024410021052001027f410020032802302206450d001a410020032802342208200128020c2207490d001a200820072007417f461b210420060b360210200141146a2004360200200141086a41003602000b200141106a2109200141146a21072001410c6a2106200141086a210803400240200520024f0d002007280200450d00200341306a2001102441002105027f2003280230220a044041002003280234220b20062802002204490d011a200b20046b21052004200a6a0c010b41000b210420072005360200200920043602002003200536022c2003200436022820032003290328370310200341306a20094100200341106a1022102320092003290330220c37020020062006280200200c422088a76a3602002008200828020041016a22053602000c010b0b20032009290200220c3703202003200c3703082000200341086a4114101e1a200341406b24000b4101017f02402000280204450d0020002802002d0000220041bf014d0440200041b801490d01200041c97e6a0f0b200041f801490d00200041897e6a21010b20010b4401017f200028020445044010000b0240200028020022012d0000418101470d00200041046a28020041014d047f100020002802000520010b2c00014100480d0010000b0b9f0101037f02402000280204044020001027200028020022022c000022014100480d0120014100470f0b41000f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200041046a28020041014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a200041046a280200200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0b2c002000200220016b2202102b200028020020002802046a2001200210081a2000200028020420026a3602040b9e0201077f02402001450d002000410c6a2107200041106a2105200041046a21060340200528020022022007280200460d01200241786a28020020014904401000200528020021020b200241786a2203200328020020016b220136020020010d01200520033602002000410120062802002002417c6a28020022016b2202102c220341016a20024138491b2204200628020022086a102d2004200120002802006a22046a2004200820016b100e1a0240200241374d0440200028020020016a200241406a3a00000c010b200341f7016a220441ff014d0440200028020020016a20043a00002000280200200120036a6a210103402002450d02200120023a0000200241087621022001417f6a21010c000b000b10000b410121010c000b000b0b1b00200028020420016a220120002802084b044020002001102e0b0b1e01017f03402000044020004108762100200141016a21010c010b0b20010b0f0020002001102e200020013602040b3901017f200028020820014904402001100b22022000280200200028020410081a20002802001a200041086a2001360200200020023602000b0b250020004101102b200028020020002802046a20013a00002000200028020441016a3602040b2b01027f2001102c220241b7016a22034180024e044010000b2000200341ff0171102f20002001200210310b3d002000200028020420026a102d200028020020002802046a417f6a2100034020010440200020013a0000200141087621012000417f6a21000c010b0b0ba00101037f230041106b2202240020012802002103024002400240024020012802042201410146044020032c000022044100480d012000200441ff0171102f0c040b200141374b0d010b200020014180017341ff0171102f0c010b2000200110300b2002200136020c2002200336020820022002290308370300200020022802002201200120022802046a102920004100102a0b20004101102a200241106a24000b070041b00a10140b810101037f230041106b220224002002200110354100210103402001411446450440200020016a41003a0000200141016a21010c010b0b2002280204200228020022036b21044100210103402001200446200141134b72450440200020016a200120036a2d00003a0000200141016a21010c010b0b20021036200241106a240020000bf30301077f230041306b22022400027f41002001280204220620012d000022034101762207200341017122031b22044102490d001a41002001280208200141016a20031b22082d00004130470d001a20082d000141f800464101740b21052002410036021020024200370308200441016a20056b41017622040440200241286a200241106a36020020022004100c22033602082002200336020c20024200370320200242003703182002200320046a360210200241186a104020012d000022034101762107200141046a2802002106200341017121030b027f02402006200720031b41017104402001280208200141016a20031b20056a2c000010442203417f460d01200220033a0018200241086a200241186a1045200541017221050b200141016a2103200141046a2106200141086a2107024003402005200628020020012d00002204410176200441017122041b4904402007280200200320041b20056a22042c000010442208417f46200441016a2c000010442204417f46720d022002200420084104746a3a0018200541026a2105200241086a200241186a10450c010b0b200020022802083602002000200229020c3702042002420037020c200241086a0c020b20004200370200200041086a0c010b20004200370200200041086a0b4100360200200241086a1036200241306a24000b1501017f200028020022010440200020013602040b0b8e0201027f230041e0006b2207240020072006370350200720053703582007410036024820074200370340200741406b41201038200728024022084200370000200820023a001f200841176a4200370000200841106a4200370000200841086a4200370000200820072802442001103920032802002003280204200110392004280200200428020420011039200741306a2001103a21010240200741086a200741206a41bc0a103b220210342001200741d8006a200741d0006a103c04402007410036021020074200370308200741086a10011038200728020810022000200741086a103d200741086a10360c010b200041e70a103b1a0b2002101420011036200741406b1036200741e0006a24000bab0201057f230041206b220324000240024020002802042202200028020022056b22042001490440200028020820026b200120046b4f0d0120002001103e2105200341186a200041086a36020020034100360214200041046a28020020002802006b210641002102200504402005100c21020b20032002360208200341146a200220056a3602002003200220066a22023602102003200236020c200420016b2101200341106a21040340200241003a00002004200428020041016a2202360200200141016a22010d000b2000200341086a103f200341086a10400c020b200420014d0d01200041046a200120056a3602000c010b200420016b2101200041046a21000340200241003a00002000200028020041016a2202360200200141016a22010d000b0b200341206a24000bf40101087f230041206b22042400200241086a2107200241046a2106200441186a2109200441146a2108034020002001464504400240200628020022032007280200470440200320002d00003a00002006200628020041016a3602000c010b2002200341016a20022802006b103e2105200920073602004100210320084100360200200628020020022802006b210a200504402005100c21030b200420033602082008200320056a36020020042003200a6a220336020c20002d00002105200441106a200341016a360200200320053a00002002200441086a103f200441086a10400b200041016a21000c010b0b200441206a24000b6201027f20004200370200200041003602080240200128020420012802006b2202450d00200020021041200141046a280200200128020022036b22014101480d00200041046a22022802002003200110081a2002200228020020016a3602000b20000b1f0020004200370200200041086a4100360200200020012001100d101220000b6601017f230041206b22042400200441106a20022903001042200420032903001042200020012802002200200128020420006b20042802102200200428021420006b20042802002200200428020420006b100320041036200441106a1036200441206a2400450b950201067f230041106b220624002001280204210720012802002101200641e70a103b2104200041086a4100360200200042003702002000200428020420062d0000220241017620024101711b2202200720016b4101746a1018027f20062d00002203410171450440200441016a210520034101760c010b20042802082105200441046a2802000b210320002002200520031017200041016a2103200041086a2105034020012007464504402005280200200320002d00004101711b20026a20012d000041047641cd0e6a2d00003a00002005280200200320002d00004101711b20026a41016a20012d0000410f7141cd0e6a2d00003a0000200141016a2101200241026a21020c010b0b20041014200641106a24000b39002001417f4a0440200028020820002802006b220041feffffff034d047f20012000410174220020002001491b0541ffffffff070b0f0b000b940101037f200120012802042000280204200028020022046b22026b2203360204200241004a044020032004200210081a200141046a28020021030b2000280200210220002003360200200141046a22032002360200200041046a220228020021042002200128020836020020012004360208200028020821022000200128020c3602082001200236020c200120032802003602000b3801037f2000280208210120002802042102200041086a210303402001200247044020032001417f6a22013602000c010b0b20002802001a0b2a01017f2001417f4a044020002001100c2202360200200020023602042000200120026a3602080f0b000b6302017f017e20012103034020035045044020034208882103200241016a21020c010b0b20004100360208200042003702002000200210382000280204417f6a21020340200150450440200220013c00002002417f6a2102200142088821010c010b0b0b990100230041d0006b220124002001200437034020012003370348200141306a200210350240200141086a200141206a41e80a103b22021034200141306a200141c8006a200141406b103c04402001410036021020014200370308200141086a10011038200128020810022000200141086a103d200141086a10360c010b200041e70a103b1a0b20021014200141306a1036200141d0006a24000b4901017f415021010240200041506a41ff0171410a4f044041a97f21012000419f7f6a41ff017141064f0d010b200020016a0f0b200041496a417f200041bf7f6a41ff01714106491b0bcd0101047f230041206b220324000240200028020422022000280208490440200220012d00003a0000200041046a2200200028020041016a3602000c010b2000200241016a20002802006b103e2104200341186a200041086a3602004100210220034100360214200041046a28020020002802006b2105200404402004100c21020b20032002360208200341146a200220046a360200200220056a220220012d00003a00002003200236020c2003200241016a3602102000200341086a103f200341086a10400b200341206a24000b990100230041d0006b220124002001200437034020012003370348200141306a200210350240200141086a200141206a41930b103b22021034200141306a200141c8006a200141406b103c04402001410036021020014200370308200141086a10011038200128020810022000200141086a103d200141086a10360c010b200041e70a103b1a0b20021014200141306a1036200141d0006a24000b990100230041d0006b220124002001200437034020012003370348200141306a200210350240200141086a200141206a41be0b103b22021034200141306a200141c8006a200141406b103c04402001410036021020014200370308200141086a10011038200128020810022000200141086a103d200141086a10360c010b200041e70a103b1a0b20021014200141306a1036200141d0006a24000bd30201017f230041e0006b2201240020012006370350200120053703582001410036024820014200370340200141406b41201038200128024022074200370000200741203a001f200741176a4200370000200741106a4200370000200741086a4200370000200141003602382001420037033020072001280244200141306a103920012802402001280244200141306a103920012802402001280244200141306a103920022802002002280204200141306a103920032802002003280204200141306a103920042802002004280204200141306a10390240200141086a200141206a41e90b103b22021034200141306a200141d8006a200141d0006a103c04402001410036021020014200370308200141086a10011038200128020810022000200141086a103d200141086a10360c010b200041e70a103b1a0b20021014200141306a1036200141406b1036200141e0006a24000be40101017f230041d0006b220724002007200637034020072005370348200741003602382007420037033020012802002001280204200741306a103920022802002002280204200741306a103920032802002003280204200741306a103920042802002004280204200741306a10390240200741086a200741206a41940c103b22011034200741306a200741c8006a200741406b103c04402007410036021020074200370308200741086a10011038200728020810022000200741086a103d200741086a10360c010b200041e70a103b1a0b20011014200741306a1036200741d0006a24000bd10100230041d0006b220124002001200637034020012005370348200141003602382001420037033020022802002002280204200141306a103920032802002003280204200141306a103920042802002004280204200141306a10390240200141086a200141206a41bf0c103b22021034200141306a200141c8006a200141406b103c04402001410036021020014200370308200141086a10011038200128020810022000200141086a103d200141086a10360c010b200041e70a103b1a0b20021014200141306a1036200141d0006a24000b990100230041d0006b220124002001200437034020012003370348200141306a200210350240200141086a200141206a41ea0c103b22021034200141306a200141c8006a200141406b103c04402001410036021020014200370308200141086a10011038200128020810022000200141086a103d200141086a10360c010b200041e70a103b1a0b20021014200141306a1036200141d0006a24000bbb09020c7f027e230041e0026b22002400100710042201100b22021005200020013602a401200020023602a001200020002903a001370330200041a0016a200041e8006a200041306a411c101e22014100102502400240200041a0016a104d220c500d0041950d104e200c510d01419a0d104e200c510440200042003700a501200042003703a001200041b0016a4100412810091a200041013602b002200020013602c0022000200041b0026a3602c402200041c0026a200041a0016a104f20004180016a200120002802b002102520004180016a10270240024020004180016a1028450d00200028028401450d002000280280012d000041c001490d010b10000b200041d0026a20004180016a105020002802d402220141024f044010000b20002802d00221020340200104402001417f6a210120022d00002103200241016a21020c010b0b200041ac016a220420033a0000200020002802b00241016a3602b002200041c0026a200041b0016a2201104f200041c0026a200041bc016a2202104f200041c0026a200041c8016a1051200041c0026a200041d0016a1051200041a0026a200041a0016a103a210320042d0000210520004190026a2001103a210420004180026a2002103a210620002903d001210c20002903c801210d20004180016a200041d0026a2003103a22072005200041c0026a2004103a2205200041b0026a2006103a2208200d200c103720081036200510362007103620004180016a105220004180016a10142006103620041036200310362002103620011036200041a0016a10360c020b41af0d104e200c5104402000410036026420004102360260200020002903603703002001200010530c020b41c50d104e200c5104402000410036025c20004103360258200020002903583703082001200041086a10530c020b41de0d104e200c5104402000410036025420004104360250200020002903503703102001200041106a10530c020b41f20d104e200c5104402000410036024c20004105360248200020002903483703182001200041186a10540c020b41870e104e200c510440200041a0016a410041c00010091a200041013602d00220002001360280012000200041d0026a3602840120004180016a200041a0016a104f20004180016a200041ac016a2201104f20004180016a200041b8016a2202104f20004180016a200041c4016a2203104f20004180016a200041d0016a105120004180016a200041d8016a105120004190026a200041a0016a103a210420004180026a2001103a2106200041f0016a2002103a2105200041e0016a2003103a210720002903d801210c20002903d001210d20004180016a200041d0026a2004103a2208200041c0026a2006103a2209200041b0026a2005103a220a200041a0026a2007103a220b200d200c1049200b1036200a1036200910362008103620004180016a105220004180016a101420071036200510362006103620041036200310362002103620011036200041a0016a10360c020b419b0e104e200c5104402000410036024420004106360240200020002903403703202001200041206a10540c020b41b50e104e200c520d002000410036023c20004107360238200020002903383703282001200041286a10530c010b10000b200041e0026a24000b850102027f017e230041106b22012400200010270240024020001028450d002000280204450d0020002802002d000041c001490d010b10000b200141086a20001050200128020c220041094f044010000b200128020821020340200004402000417f6a210020023100002003420886842103200241016a21020c010b0b200141106a240020030b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b4301017f230041206b22022400200241086a200028020020002802042802001025200241086a2001105620002802042200200028020041016a360200200241206a24000be60101047f200110212204200128020422024b04401000200141046a28020021020b200128020021052000027f024002400240027f0240200204404100210120052c00002203417f4c0d012005450d030c040b41000c010b200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a210120050d010b410021030c010b410021032002200149200120046a20024b720d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b4601017f230041206b22022400200241086a2000280200200028020428020010252001200241086a104d37030020002802042200200028020041016a360200200241206a24000be40201057f230041406a220124002001410036022020014200370318200141186a410010552001412c6a410036020020014200370224410121030240200141306a20001011220428020420012d00302202410176200241017122051b2202450d0002400240200241014604402004280208200441016a20051b2c0000417f4a0d030c010b200241384f0d010b200241016a21030c010b200241016a210303402002450d01200341016a2103200241087621020c000b000b20041014200141206a2802002003490440200141186a200310550b2001200141086a200010112200280208200041016a20002d0000220241017122031b36023020012000280204200241017620031b36023420012001290330370300200141186a2001103220001014200141246a2200280200200141286a28020047044010000b2001280218200128021c1006200028020022000440200141286a20003602000b20012802181a200141406b24000bea0401077f230041e0006b2202240020012802042104200128020021052002101a2106200241186a4200370300200242003703102002410136022c2002200036022020022002412c6a360224200241306a200041011025024002400240024002402002280234450d0020022802302d000041c0014f0d00200241c8006a200241306a1050200241306a10212101200228024822000440200228024c220320014f0d020b41002100200241d8006a410036020020024200370350410021030c020b200241d0006a101a1a0c030b200241d8006a410036020020024200370350200320012001417f461b22034170490440200020036a21072003410a4d0d01200341106a4170712208100c21012002200336025420022008410172360250200220013602580c020b000b200220034101743a0050200241d0006a41017221010b034020002007470440200120002d00003a0000200141016a2101200041016a21000c010b0b200141003a00000b200241106a2100024020022d0000410171450440200241003b01000c010b200228020841003a00002002410036020420022d0000410171450d00200241086a2802001a200241003602000b200241086a200241d8006a28020036020020022002290350370300200241d0006a1019200241d0006a101420022802242201200128020041016a360200200241206a20001051200241206a200241186a1051200241306a200241c8006a20044101756a2200200241d0006a200610112201200241106a29030020022903182004410171047f200028020020056a2802000520050b110600200241306a1052200241306a10142001101420061014200241e0006a24000bc70202087f027e230041b0016b220224002001280200210720012802042103200241086a4100412410091a20024200370338200242003703302002410136029001200220003602a001200220024190016a3602a401200241a0016a200241086a104f200241a0016a200241146a2200104f200241a0016a200241206a2201104f200241a0016a200241306a1051200241a0016a200241386a1051200241e0006a200241086a103a2104200241d0006a2000103a2105200241406b2001103a21062002290338210a2002290330210b200241a0016a200220034101756a20024190016a2004103a220320024180016a2005103a2208200241f0006a2006103a2209200b200a2007110500200910362008103620031036200241a0016a1052200241a0016a10142006103620051036200410362001103620001036200241086a1036200241b0016a24000b3801017f200028020820014904402001100b200028020020002802041008210220002802001a200041086a2001360200200020023602000b0be80101037f230041206b22022400024002402000280204450d0020002802002d000041c0014f0d00200241186a2000105020022802182103200241106a200010502002280210210420001021200241003602082002420037030020046a20036b2200450d0120022000104120004101480d0120022802042003200010081a2002200228020420006a3602040c010b20024100360208200242003703000b2001280200220004402001200036020420014100360208200142003702000b2001200228020036020020012002290204370204200241003602082002420037030020021036200241206a24000b0ba904010041bc0a0ba104307830303030303030303030303030303030303030303030303030303030303030303030303030303031000030783030303030303030303030303030303030303030303030303030303030303030303030303030303200307830303030303030303030303030303030303030303030303030303030303030303030303030303033003078303030303030303030303030303030303030303030303030303030303030303030303030303030340030783030303030303030303030303030303030303030303030303030303030303030303030303030303500307830303030303030303030303030303030303030303030303030303030303030303030303030303036003078303030303030303030303030303030303030303030303030303030303030303030303030303030370030783030303030303030303030303030303030303030303030303030303030303030303030303030303800696e69740063726f73735f63616c6c5f65637265636f7665720063726f73735f63616c6c5f736861323536686173680063726f73735f63616c6c5f726970656d64313630686173680063726f73735f63616c6c5f64617461436f70790063726f73735f63616c6c5f6269674d6f644578700063726f73735f63616c6c5f626e3235364164640063726f73735f63616c6c5f626e3235365363616c61724d756c0063726f73735f63616c6c5f626e32353650616972696e670030313233343536373839616263646566";

    public static String BINARY = BINARY_0;

    public static final String FUNC_CROSS_CALL_BN256PAIRING = "cross_call_bn256Pairing";

    public static final String FUNC_CROSS_CALL_BN256ADD = "cross_call_bn256Add";

    public static final String FUNC_CROSS_CALL_ECRECOVER = "cross_call_ecrecover";

    public static final String FUNC_CROSS_CALL_SHA256HASH = "cross_call_sha256hash";

    public static final String FUNC_CROSS_CALL_RIPEMD160HASH = "cross_call_ripemd160hash";

    public static final String FUNC_CROSS_CALL_DATACOPY = "cross_call_dataCopy";

    public static final String FUNC_CROSS_CALL_BIGMODEXP = "cross_call_bigModExp";

    public static final String FUNC_CROSS_CALL_BN256SCALARMUL = "cross_call_bn256ScalarMul";

    protected ContractCallPrecompile(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ContractCallPrecompile(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> cross_call_bn256Pairing(String in, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_BN256PAIRING, Arrays.asList(in,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> cross_call_bn256Add(byte[] ax, byte[] ay, byte[] bx, byte[] by, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_BN256ADD, Arrays.asList(ax,ay,bx,by,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> cross_call_ecrecover(byte[] msgh, Uint8 v, byte[] r, byte[] s, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_ECRECOVER, Arrays.asList(msgh,v,r,s,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> cross_call_sha256hash(String in, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_SHA256HASH, Arrays.asList(in,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static RemoteCall<ContractCallPrecompile> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractCallPrecompile.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractCallPrecompile> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractCallPrecompile.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ContractCallPrecompile> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractCallPrecompile.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ContractCallPrecompile> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ContractCallPrecompile.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<String> cross_call_ripemd160hash(String in, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_RIPEMD160HASH, Arrays.asList(in,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> cross_call_dataCopy(String in, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_DATACOPY, Arrays.asList(in,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> cross_call_bigModExp(byte[] base, byte[] exponent, byte[] modulus, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_BIGMODEXP, Arrays.asList(base,exponent,modulus,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<String> cross_call_bn256ScalarMul(byte[] x, byte[] y, byte[] scalar, Uint64 value, Uint64 gas) {
        final WasmFunction function = new WasmFunction(FUNC_CROSS_CALL_BN256SCALARMUL, Arrays.asList(x,y,scalar,value,gas), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static ContractCallPrecompile load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ContractCallPrecompile(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ContractCallPrecompile load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ContractCallPrecompile(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
