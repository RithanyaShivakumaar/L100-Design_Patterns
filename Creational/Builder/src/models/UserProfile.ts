import { IUserProfile, UserPreferences } from '../interfaces/IUserProfile';

export class UserProfile implements IUserProfile {
  public readonly username: string;
  public readonly email: string;
  public readonly phone: string | null;
  public readonly bio: string;
  public readonly profilePicture: string;
  public readonly preferences: UserPreferences;
  public readonly linkedAccounts: string[];
  public readonly isVerified: boolean;
  public readonly role: string;

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
  }: IUserProfile) {
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
