import { UserProfile } from '../models/UserProfile';
import { IUserProfile, UserPreferences } from '../interfaces/IUserProfile';

export class UserProfileBuilder {
  private _profile: IUserProfile;

  constructor(username: string, email: string) {
    if (!username || !email) {
      throw new Error("Username and Email are required.");
    }

    this._profile = {
      username,
      email
    };
  }

  withPhone(phone: string): UserProfileBuilder {
    this._profile.phone = phone;
    return this;
  }

  withBio(bio: string): UserProfileBuilder {
    this._profile.bio = bio;
    return this;
  }

  withProfilePicture(profilePicture: string): UserProfileBuilder {
    this._profile.profilePicture = profilePicture;
    return this;
  }

  withPreferences(preferences: UserPreferences): UserProfileBuilder {
    this._profile.preferences = preferences;
    return this;
  }

  withLinkedAccounts(linkedAccounts: string[]): UserProfileBuilder {
    this._profile.linkedAccounts = linkedAccounts;
    return this;
  }

  isVerified(isVerified: boolean = true): UserProfileBuilder {
    this._profile.isVerified = isVerified;
    return this;
  }

  withRole(role: string): UserProfileBuilder {
    this._profile.role = role;
    return this;
  }

  build(): UserProfile {
    return new UserProfile(this._profile);
  }
}
