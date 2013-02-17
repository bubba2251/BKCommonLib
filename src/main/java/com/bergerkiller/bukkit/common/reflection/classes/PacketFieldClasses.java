package com.bergerkiller.bukkit.common.reflection.classes;

import java.util.Collections;
import java.util.List;

import net.minecraft.server.v1_4_R1.Vec3D;

import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import com.bergerkiller.bukkit.common.bases.IntVector3;
import com.bergerkiller.bukkit.common.reflection.FieldAccessor;
import com.bergerkiller.bukkit.common.reflection.NMSClassTemplate;
import com.bergerkiller.bukkit.common.reflection.SafeConstructor;
import com.bergerkiller.bukkit.common.reflection.TranslatorFieldAccessor;
import com.bergerkiller.bukkit.common.reflection.accessors.DataWatcherFieldAccessor;
import com.bergerkiller.bukkit.common.reflection.accessors.DifficultyFieldAccessor;
import com.bergerkiller.bukkit.common.reflection.accessors.GameModeFieldAccessor;
import com.bergerkiller.bukkit.common.reflection.accessors.ItemStackFieldAccessor;
import com.bergerkiller.bukkit.common.reflection.accessors.WorldTypeFieldAccessor;
import com.bergerkiller.bukkit.common.utils.CommonUtil;
import com.bergerkiller.bukkit.common.utils.NativeUtil;

public class PacketFieldClasses {
	public static class NMSPacket extends NMSClassTemplate {
		public final FieldAccessor<Integer> packetID = getField("packetID");
		public final FieldAccessor<Boolean> lowPriority = getField("lowPriority");
		public final FieldAccessor<Long> timestamp = getField("timestamp");
		private final SafeConstructor<Object> constructor0 = getConstructor();
		public Object newInstance() {
			return constructor0.newInstance();
		}
	}
	public static class NMSPacket0KeepAlive extends NMSPacket {
		public final FieldAccessor<Integer> key = getField("a");
	}
	public static class NMSPacket1Login extends NMSPacket {
		public final FieldAccessor<Integer> playerId = getField("a");
		public final WorldTypeFieldAccessor worldType = new WorldTypeFieldAccessor(getField("b"));
		public final FieldAccessor<Boolean> hardcore = getField("c");
		public final GameModeFieldAccessor gameMode = new GameModeFieldAccessor(getField("d"));
		public final FieldAccessor<Integer> dimension = getField("e");
		public final DifficultyFieldAccessor difficulty = new DifficultyFieldAccessor(getField("f"));
		//public final FieldAccessor<Byte> unused = getField("g");
		public final FieldAccessor<Byte> maxPlayers = getField("h");
	}
	public static class NMSPacket2Handshake extends NMSPacket {
		public final FieldAccessor<Integer> protocolVersion = getField("a");
		public final FieldAccessor<String> playerName = getField("b");
		public final FieldAccessor<String> serverName = getField("c");
		public final FieldAccessor<Integer> serverPort = getField("d");
	}
	public static class NMSPacket3Chat extends NMSPacket {
		public final FieldAccessor<Boolean> isFromServer = getField("c");
		public final FieldAccessor<String> message = getField("message");
	}
	public static class NMSPacket4UpdateTime extends NMSPacket {
		public final FieldAccessor<Long> age = getField("a");
		public final FieldAccessor<Long> timeOfDay = getField("b");
	}
	public static class NMSPacket5EntityEquipment extends NMSPacket30Entity {
		public final FieldAccessor<Integer> slot = getField("b");
		public final FieldAccessor<ItemStack> item = new ItemStackFieldAccessor(getField("c"));
	}
	public static class NMSPacket6SpawnPosition extends NMSPacket {
		public final FieldAccessor<Integer> x = getField("x");
		public final FieldAccessor<Integer> y = getField("y");
		public final FieldAccessor<Integer> z = getField("z");
	}
	public static class NMSPacket7UseEntity extends NMSPacket {
		public final FieldAccessor<Integer> playerId = getField("a");
		public final FieldAccessor<Integer> targetEntityId = getField("target");
		public final FieldAccessor<Integer> action = getField("action");
	}
	public static class NMSPacket8UpdateHealth extends NMSPacket {
		public final FieldAccessor<Short> health = getField("a");
		public final FieldAccessor<Short> food = getField("b");
		public final FieldAccessor<Short> foodSaturation = getField("c");
	}
	public static class NMSPacket9Respawn extends NMSPacket {
	}
	public static class NMSPacket10Flying extends NMSPacket {
	}
	public static class NMSPacket11PlayerPosition extends NMSPacket {
	}
	public static class NMSPacket12PlayerLook extends NMSPacket {
	}
	public static class NMSPacket13PlayerLookMove extends NMSPacket {
	}
	public static class NMSPacket14BlockDig extends NMSPacket {
	}
	public static class NMSPacket15Place extends NMSPacket {
	}
	public static class NMSPacket16BlockItemSwitch extends NMSPacket {
	}
	public static class NMSPacket17EntityLocationAction extends NMSPacket30Entity {
		//public final FieldAccessor<Integer> unused = getField("b");
		public final FieldAccessor<Integer> blockX = getField("c");
		public final FieldAccessor<Integer> blockY = getField("d");
		public final FieldAccessor<Integer> blockZ = getField("e");
	}
	public static class NMSPacket18ArmAnimation extends NMSPacket30Entity {
		public final FieldAccessor<Integer> animation = getField("b");
	}
	public static class NMSPacket19EntityAction extends NMSPacket30Entity {
		public final FieldAccessor<Integer> animation = getField("animation");
	}
	public static class NMSPacket20NamedEntitySpawn extends NMSPacket30Entity {
		public final FieldAccessor<String> entityName = getField("b");
		public final FieldAccessor<Integer> x = getField("c");
		public final FieldAccessor<Integer> y = getField("d");
		public final FieldAccessor<Integer> z = getField("e");
		public final FieldAccessor<Byte> yaw = getField("f");
		public final FieldAccessor<Byte> pitch = getField("g");
		public final FieldAccessor<Integer> heldItemId = getField("h");
		public final DataWatcherFieldAccessor dataWatcher = new DataWatcherFieldAccessor(getField("i"));
	}
	public static class NMSPacket22Collect extends NMSPacket {
		public final FieldAccessor<Integer> collectedItemId = getField("a");
		public final FieldAccessor<Integer> collectorEntityId = getField("b");
	}
	public static class NMSPacket23VehicleSpawn extends NMSPacket30Entity {
		public final FieldAccessor<Integer> entityType = getField("j");
		public final FieldAccessor<Integer> x = getField("b");
		public final FieldAccessor<Integer> y = getField("c");
		public final FieldAccessor<Integer> z = getField("d");
		public final FieldAccessor<Byte> yaw = getField("h");
		public final FieldAccessor<Byte> pitch = getField("i");
		public final FieldAccessor<Integer> extraData = getField("k");
		public final FieldAccessor<Integer> motX = getField("e");
		public final FieldAccessor<Integer> motY = getField("f");
		public final FieldAccessor<Integer> motZ = getField("g");
		private final SafeConstructor<Object> constructor1 = getConstructor(EntityRef.TEMPLATE.getType(), int.class);

		public Object newInstance(org.bukkit.entity.Entity entity, int type) {
			return constructor1.newInstance(NativeUtil.getNative(entity), type);
		}
	}
	public static class NMSPacket24MobSpawn extends NMSPacket30Entity {
		public final FieldAccessor<Integer> entityType = getField("b");
		public final FieldAccessor<Integer> x = getField("c");
		public final FieldAccessor<Integer> y = getField("d");
		public final FieldAccessor<Integer> z = getField("e");
		public final FieldAccessor<Integer> motX = getField("f");
		public final FieldAccessor<Integer> motY = getField("g");
		public final FieldAccessor<Integer> motZ = getField("h");
		public final FieldAccessor<Byte> yaw = getField("i");
		public final FieldAccessor<Byte> pitch = getField("j");
		public final FieldAccessor<Byte> headYaw = getField("k");
		public final DataWatcherFieldAccessor dataWatcher = new DataWatcherFieldAccessor(getField("s"));
		private final SafeConstructor<Object> constructor1 = getConstructor(CommonUtil.getNMSClass("EntityLiving"));
		public Object newInstance(Object entityLiving) {
			return constructor1.newInstance(entityLiving);
		}
	}
	public static class NMSPacket25EntityPainting extends NMSPacket30Entity {
		public final FieldAccessor<Integer> x = getField("b");
		public final FieldAccessor<Integer> y = getField("c");
		public final FieldAccessor<Integer> z = getField("d");
		public final FieldAccessor<BlockFace> direction = new TranslatorFieldAccessor<BlockFace>(getField("e")) {
			private final BlockFace[] faces = {BlockFace.SOUTH, BlockFace.WEST, BlockFace.NORTH, BlockFace.EAST};

			@Override
			public BlockFace convert(Object value) {
				final int idx = ((Integer) value).intValue();
				return (idx >= 0 && idx < faces.length) ? faces[idx] : BlockFace.NORTH;
			}

			@Override
			public Object revert(BlockFace value) {
				for (int i = 0; i < faces.length; i++) {
					if (value == faces[i]) {
						return i;
					}
				}
				return 0;
			}
		};
		public final FieldAccessor<String> art = getField("f");
	}
	public static class NMSPacket26AddExpOrb extends NMSPacket30Entity {
		public final FieldAccessor<Integer> x = getField("b");
		public final FieldAccessor<Integer> y = getField("c");
		public final FieldAccessor<Integer> z = getField("d");
		public final FieldAccessor<Integer> experience = getField("e");
	}
	public static class NMSPacket28EntityVelocity extends NMSPacket30Entity {
		public final FieldAccessor<Integer> motX = getField("b");
		public final FieldAccessor<Integer> motY = getField("c");
		public final FieldAccessor<Integer> motZ = getField("d");
		private final SafeConstructor<Object> constructor1 = getConstructor(EntityRef.TEMPLATE.getType());
		private final SafeConstructor<Object> constructor2 = getConstructor(int.class, double.class, double.class, double.class);

		public Object newInstance(org.bukkit.entity.Entity entity) {
			return constructor1.newInstance(NativeUtil.getNative(entity));
		}
		public Object newInstance(int entityId, double motX, double motY, double motZ) {
			return constructor2.newInstance(entityId, motX, motY, motZ);
		}
	}
	public static class NMSPacket29DestroyEntity extends NMSPacket {
		public final FieldAccessor<int[]> entityIds = getField("a");
		private final SafeConstructor<Object> constructor1 = getConstructor(int[].class);

		public Object newInstance(int... entityIds) {
			return constructor1.newInstance(entityIds);
		}
		public Object newInstance(org.bukkit.entity.Entity... entities) {
			int[] ids = new int[entities.length];
			for (int i = 0; i < ids.length; i++) {
				ids[i] = entities[i].getEntityId();
			}
			return newInstance(ids);
		}
	}
	public static class NMSPacket30Entity extends NMSPacket {
		public final FieldAccessor<Integer> entityId = getField("a");
	}
	public static class NMSPacket31RelEntityMove extends NMSPacket30Entity {
		public final FieldAccessor<Byte> dx = getField("b");
		public final FieldAccessor<Byte> dy = getField("c");
		public final FieldAccessor<Byte> dz = getField("d");
		private final SafeConstructor<Object> constructor1 = getConstructor(int.class, byte.class, byte.class, byte.class);

		public Object newInstance(int entityId, byte dx, byte dy, byte dz) {
			return constructor1.newInstance(entityId, dx, dy, dz);
		}
	}
	public static class NMSPacket32EntityLook extends NMSPacket30Entity {
		public final FieldAccessor<Byte> dyaw = getField("e");
		public final FieldAccessor<Byte> dpitch = getField("f");
		private final SafeConstructor<Object> constructor1 = getConstructor(int.class, byte.class, byte.class);

		public Object newInstance(int entityId, byte dyaw, byte dpitch) {
			return constructor1.newInstance(entityId, dyaw, dpitch);
		}
	}
	public static class NMSPacket33RelEntityMoveLook extends NMSPacket30Entity {
		public final FieldAccessor<Byte> dx = getField("b");
		public final FieldAccessor<Byte> dy = getField("c");
		public final FieldAccessor<Byte> dz = getField("d");
		public final FieldAccessor<Byte> dyaw = getField("e");
		public final FieldAccessor<Byte> dpitch = getField("f");
		private final SafeConstructor<Object> constructor1 = getConstructor(int.class, byte.class, byte.class, byte.class, byte.class, byte.class);

		public Object newInstance(int entityId, byte dx, byte dy, byte dz, byte dyaw, byte dpitch) {
			return constructor1.newInstance(entityId, dx, dy, dz, dyaw, dpitch);
		}
	}
	public static class NMSPacket34EntityTeleport extends NMSPacket30Entity {
		public final FieldAccessor<Integer> x = getField("b");
		public final FieldAccessor<Integer> y = getField("c");
		public final FieldAccessor<Integer> z = getField("d");
		public final FieldAccessor<Byte> yaw = getField("e");
		public final FieldAccessor<Byte> pitch = getField("f");
		private final SafeConstructor<Object> constructor1 = getConstructor(EntityRef.TEMPLATE.getType());
		private final SafeConstructor<Object> constructor2 = getConstructor(int.class, int.class, int.class, int.class, byte.class, byte.class);

		public Object newInstance(org.bukkit.entity.Entity entity) {
			return constructor1.newInstance(NativeUtil.getNative(entity));
		}
		public Object newInstance(int entityId, int x, int y, int z, byte yaw, byte pitch) {
			return constructor2.newInstance(entityId, x, y, z, yaw, pitch);
		}
	}
	public static class NMSPacket35EntityHeadRotation extends NMSPacket30Entity {
		public final FieldAccessor<Byte> headYaw = getField("b");
	}
	public static class NMSPacket38EntityStatus extends NMSPacket30Entity {
		public final FieldAccessor<Byte> status = getField("b");
	}
	public static class NMSPacket39AttachEntity extends NMSPacket {
		public final FieldAccessor<Integer> passengerId = getField("a");
		public final FieldAccessor<Integer> vehicleId = getField("b");
		private final SafeConstructor<Object> constructor1 = getConstructor(EntityRef.TEMPLATE.getType(), EntityRef.TEMPLATE.getType());

		public Object newInstance(org.bukkit.entity.Entity passenger, org.bukkit.entity.Entity vehicle) {
			return constructor1.newInstance(NativeUtil.getNative(passenger), NativeUtil.getNative(vehicle));
		}
	}
	public static class NMSPacket40EntityMetadata extends NMSPacket {
		public final FieldAccessor<Integer> passengerId = getField("a");
		/** CraftBukkit uses rawtypes for this, so do we */
		@SuppressWarnings("rawtypes")
		public final FieldAccessor<List> watchedObjects = getField("b");
		private final SafeConstructor<Object> constructor1 = getConstructor(int.class, DataWatcherRef.TEMPLATE.getType(), boolean.class);

		public Object newInstance(int entityId, Object dataWatcher, boolean sendUnchangedData) {
			return constructor1.newInstance(entityId, dataWatcher, sendUnchangedData);
		}
	}
	public static class NMSPacket41MobEffect extends NMSPacket {
	}
	public static class NMSPacket42RemoveMobEffect extends NMSPacket {
	}
	public static class NMSPacket43SetExperience extends NMSPacket {
	}
	public static class NMSPacket51MapChunk extends NMSPacket {
		public final FieldAccessor<Integer> size = getField("size");
		public final FieldAccessor<byte[]> buffer = getField("buffer");
		public final FieldAccessor<byte[]> inflatedBuffer = getField("inflatedBuffer");
		public final FieldAccessor<Boolean> hasBiomeData = getField("e");
		public final FieldAccessor<Integer> x = getField("a");
		public final FieldAccessor<Integer> z = getField("b");
		public final FieldAccessor<Integer> chunkDataBitMap = getField("c");
		public final FieldAccessor<Integer> chunkBiomeBitMap = getField("d");
		private final SafeConstructor<Object> constructor1 = getConstructor(CommonUtil.getNMSClass("Chunk"), boolean.class, int.class);

		public Object newInstance(Object chunk) {
			return newInstance(chunk, true, 0xFFFF);
		}
		public Object newInstance(Object chunk, boolean hasBiomeData, int sectionsMask) {
			return constructor1.newInstance(chunk, hasBiomeData, sectionsMask);
		}
	}
	public static class NMSPacket52MultiBlockChange extends NMSPacket {
		public final FieldAccessor<Integer> chunkX = getField("a");
		public final FieldAccessor<Integer> chunkZ = getField("b");
		public final FieldAccessor<Integer> blockCount = getField("d");
		public final FieldAccessor<byte[]> blockData = getField("e");
	}
	public static class NMSPacket53BlockChange extends NMSPacket {
		public final FieldAccessor<Integer> x = getField("a");
		public final FieldAccessor<Integer> y = getField("b");
		public final FieldAccessor<Integer> z = getField("c");
		public final FieldAccessor<Integer> typeId = getField("material");
		public final FieldAccessor<Integer> data = getField("data");
	}
	public static class NMSPacket54PlayNoteBlock extends NMSPacket {
		public final FieldAccessor<Integer> x = getField("a");
		public final FieldAccessor<Integer> y = getField("b");
		public final FieldAccessor<Integer> z = getField("c");
		public final FieldAccessor<Integer> arg1 = getField("d");
		public final FieldAccessor<Integer> arg2 = getField("e");
		public final FieldAccessor<Integer> typeId = getField("f");
	}
	public static class NMSPacket55BlockBreakAnimation extends NMSPacket {
	}
	public static class NMSPacket56MapChunkBulk extends NMSPacket {
		public final FieldAccessor<int[]> bulk_x = getField("c");
		public final FieldAccessor<int[]> bulk_z = getField("d");
		public final FieldAccessor<int[]> bulk_chunkDataBitMap = getField("a");
		public final FieldAccessor<int[]> bulk_chunkBiomeBitMap = getField("b");
		public final FieldAccessor<byte[][]> inflatedBuffers = getField("inflatedBuffers");
		public final FieldAccessor<byte[]> buildBuffer = getField("buildBuffer");
		public final FieldAccessor<byte[]> deflatedData = getField("buffer");
		public final FieldAccessor<Integer> deflatedSize = getField("size");
		public final FieldAccessor<Boolean> hasSkyLight = getField("h");
	}
	public static class NMSPacket60Explosion extends NMSPacket {
		public final FieldAccessor<Double> x = getField("a");
		public final FieldAccessor<Double> y = getField("b");
		public final FieldAccessor<Double> z = getField("c");
		public final FieldAccessor<Float> radius = getField("d");
		public final FieldAccessor<List<Object>> blocks = getField("e");
		public final FieldAccessor<Float> pushMotX = getField("f");
		public final FieldAccessor<Float> pushMotY = getField("g");
		public final FieldAccessor<Float> pushMotZ = getField("h");
		private final SafeConstructor<Object> constructor1 = getConstructor(double.class, double.class, double.class, float.class, List.class, Vec3D.class);

		@SuppressWarnings("unchecked")
		public Object newInstance(double x, double y, double z, float radius) {
			return newInstance(x, y, z, radius, Collections.EMPTY_LIST);
		}

		public Object newInstance(double x, double y, double z, float radius, List<IntVector3> blocks) {
			return newInstance(x, y, z, radius, blocks, null);
		}

		public Object newInstance(double x, double y, double z, float radius, List<IntVector3> blocks, Vector pushedForce) {
			Vec3D vec = pushedForce == null ? null : Vec3D.a(pushedForce.getX(), pushedForce.getY(), pushedForce.getZ());
			return constructor1.newInstance(x, y, z, radius, blocks, vec);
		}
	}
	public static class NMSPacket61WorldEvent extends NMSPacket {
	}
	public static class NMSPacket62NamedSoundEffect extends NMSPacket {
	}
	public static class NMSPacket70Bed extends NMSPacket {
	}
	public static class NMSPacket71Weather extends NMSPacket {
	}
	public static class NMSPacket100OpenWindow extends NMSPacket {
	}
	public static class NMSPacket101CloseWindow extends NMSPacket {
	}
	public static class NMSPacket102WindowClick extends NMSPacket {
	}
	public static class NMSPacket103SetSlot extends NMSPacket {
	}
	public static class NMSPacket104WindowItems extends NMSPacket {
	}
	public static class NMSPacket105CraftProgressBar extends NMSPacket {
	}
	public static class NMSPacket106Transaction extends NMSPacket {
	}
	public static class NMSPacket107SetCreativeSlot extends NMSPacket {
	}
	public static class NMSPacket108ButtonClick extends NMSPacket {
	}
	public static class NMSPacket130UpdateSign extends NMSPacket {
		public final FieldAccessor<Integer> x = getField("x");
		public final FieldAccessor<Integer> y = getField("y");
		public final FieldAccessor<Integer> z = getField("z");
		public final FieldAccessor<String[]> lines = getField("lines");
	}
	public static class NMSPacket131ItemData extends NMSPacket {
	}
	public static class NMSPacket132TileEntityData extends NMSPacket {
	}
	public static class NMSPacket200Statistic extends NMSPacket {
	}
	public static class NMSPacket201PlayerInfo extends NMSPacket {
	}
	public static class NMSPacket202Abilities extends NMSPacket {
	}
	public static class NMSPacket203TabComplete extends NMSPacket {
	}
	public static class NMSPacket204LocaleAndViewDistance extends NMSPacket {
		public final FieldAccessor<String> locale = getField("a");
		public final FieldAccessor<Integer> viewDistance = getField("b");
		public final FieldAccessor<Integer> chatFlags = getField("c");
		public final FieldAccessor<Boolean> chatColorsEnabled = getField("d");
		public final DifficultyFieldAccessor difficulty = new DifficultyFieldAccessor(getField("e"));
		public final FieldAccessor<Boolean> showCape = getField("f");
	}
	public static class NMSPacket205ClientCommand extends NMSPacket {
	}
	public static class NMSPacket250CustomPayload extends NMSPacket {
	}
	public static class NMSPacket252KeyResponse extends NMSPacket {
	}
	public static class NMSPacket253KeyRequest extends NMSPacket {
	}
	public static class NMSPacket254GetInfo extends NMSPacket {
	}
	public static class NMSPacket255KickDisconnect extends NMSPacket {
	}
}