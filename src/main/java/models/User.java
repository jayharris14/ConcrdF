package models;

import java.util.ArrayList;
import java.util.HashMap;


public class User
{
	String profileData;
	String userName;
	Role role;
	HashMap<Server, Role> roles= new HashMap<Server, Role>();
	UserManager usermanager;
	
	
	
	/**
	 * @param profileData
	 * @param userName
	 * @param role
	 * @param realName
	 * @param id
	 * @param blocks
	 * @param profilePic
	 * @param password
	 */
	public User(String profileData, String userName, Role role, String realName, int id, ArrayList<User> blocks,
			String profilePic, String password) {
		super();
		this.profileData = profileData;
		this.userName = userName;
		this.role = role;
		this.realName = realName;
		this.id = id;
		this.Blocks = blocks;
		this.profilePic = profilePic;
		this.password = password;
	}

	public User() {
		this(null, "lou", null,"louise", 1, null, null, "lll");
	}
	public void setRole(Role role, Server concordServer) {
		this.role=role;
		roles.put(concordServer, role);
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public HashMap<Server, Role> getRoles() {
		return roles;
	}

	public void setRoles(HashMap<Server, Role> roles) {
		this.roles = roles;
	}

	public UserManager getUsermanager() {
		return usermanager;
	}

	public void setUsermanager(UserManager usermanager) {
		this.usermanager = usermanager;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<User> getBlocks() {
		return Blocks;
	}

	public void setBlocks(ArrayList<User> blocks) {
		Blocks = blocks;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getProfileData() {
		return profileData;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param profileData
	 * @param userName
	 * @param role
	 * @param roles
	 * @param usermanager
	 * @param realName
	 * @param id
	 * @param blocks
	 * @param profilePic
	 * @param password
	 */
	

	/**
	 * @param userName
	 * @param realName
	 * @param password
	 */
	


	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	String realName;
	int id;
	ArrayList<User> Blocks= new ArrayList<User>();
	String profilePic;
	String password;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		public void addBlock(User BlockedUser)
		{
			Blocks.add(BlockedUser);
		}
		public void removeBlock(User BlockedUser)
		{
			Blocks.remove(BlockedUser);
		}
		public void setProfileData(String profileData)
		{
			this.profileData=profileData;
		}
		public void setUserName(String realName, String userName)
		{
			this.realName=realName;
			this.userName=userName;
			
		}
		
		
		
		
}
