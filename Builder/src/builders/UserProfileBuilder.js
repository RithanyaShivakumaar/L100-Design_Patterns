const UserProfile = require('../models/UserProfile');

class UserProfileBuilder {
  constructor(username, email) {
    if (!username || !email) {
      throw new Error("Username and Email are required.");
    }

    this._profile = {
      username,
      email
    };
  }

  withPhone(phone) {
    this._profile.phone = phone;
    return this;
  }

  withBio(bio) {
    this._profile.bio = bio;
    return this;
  }

  withProfilePicture(profilePicture) {
    this._profile.profilePicture = profilePicture;
    return this;
  }

  withPreferences(preferences) {
    this._profile.preferences = preferences;
    return this;
  }

  withLinkedAccounts(linkedAccounts) {
    this._profile.linkedAccounts = linkedAccounts;
    return this;
  }

  isVerified(isVerified = true) {
    this._profile.isVerified = isVerified;
    return this;
  }

  withRole(role) {
    this._profile.role = role;
    return this;
  }

  build() {
    return new UserProfile(this._profile);
  }
}

module.exports = UserProfileBuilder;
