package immutability;

import java.util.List;

public final class ImmutableExample {

	// private final data members
	// public constructor
    // getter methods, no setter
	

	private final List<String> list;

	public ImmutableExample(List<String> list) {
		super();
		this.list = list;
	}

	public List<String> getList() {
		return this.list;
	}

}