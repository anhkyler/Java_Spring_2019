import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		UUID uuid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		/*
		 * The node value associated with this UUID.
		 * 
		 * The 48 bit node value is constructed from the node field of this UUID. This
		 * field is intended to hold the IEEE 802 address of the machine that generated
		 * this UUID to guarantee spatial uniqueness.
		 * 
		 * The node value is only meaningful in a time-based UUID, which has version type
		 * 1. If this UUID is not a time-based UUID then this method throws
		 * UnsupportedOperationException.
		 * 
		 * Returns: The node value associated with this UUID.
		 */
		long nodeValue = uuid.node();
		System.out.println("nodeValue = " + nodeValue);
	}

}
