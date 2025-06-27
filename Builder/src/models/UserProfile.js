class UserProfile {
  constructor({
    username,
    email,
    phone = null,
    bio = '',
    profilePicture = '',
    preferences = {},
    linkedAccounts = [],
    isVerified = false,
    role = 'user'
  }) {
    this.username = username;
    this.email = email;
    this.phone = phone;
    this.bio = bio;
    this.profilePicture = profilePicture;
    this.preferences = preferences;
    this.linkedAccounts = linkedAccounts;
    this.isVerified = isVerified;
    this.role = role;

    Object.freeze(this); // Make it immutable after creation
  }
}

module.exports = UserProfile;
