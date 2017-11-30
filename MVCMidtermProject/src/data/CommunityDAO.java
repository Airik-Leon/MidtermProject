package data;

import entities.Community;

public interface CommunityDAO {
	public Community getCommunity(int id);
	public Community createCommunity(Community community);
	public Community deleteCommunity(int id);
	public Community updateCommunityName(int id, String name);
}
