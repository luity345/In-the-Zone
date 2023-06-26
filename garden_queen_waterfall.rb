# This is the main script to calculate distances between two geographical points
# using the Haversine formula
 
RAD_PER_DEG = 0.017453293  #  PI/180

# the great circle distance d will be in whatever units R is in

Rmiles = 3956           # radius of the great circle in miles
Rkm = 6371              # radius in kilometers...some algorithms use 6367
Rfeet = Rmiles * 5282   # radius in feet
Rmeters = Rkm * 1000    # radius in meters
 
def haversine(lat1, lon1, lat2, lon2)
    dlon = lon2 - lon1
    dlat = lat2 - lat1
 
    dlon_rad = dlon * RAD_PER_DEG 
    dlat_rad = dlat * RAD_PER_DEG
 
    lat1_rad = lat1 * RAD_PER_DEG
    lon1_rad = lon1 * RAD_PER_DEG
 
    lat2_rad = lat2 * RAD_PER_DEG
    lon2_rad = lon2 * RAD_PER_DEG
 
    a = (Math.sin(dlat_rad/2))**2 + Math.cos(lat1_rad) * Math.cos(lat2_rad) * (Math.sin(dlon_rad/2))**2
    c = 2 * Math.atan2( Math.sqrt(a), Math.sqrt(1-a))
 
    dMi = Rmiles * c          # delta between the two points in miles
    dKm = Rkm * c             # delta in kilometers
    dFeet = Rfeet * c         # delta in feet
    dMeters = Rmeters * c     # delta in meters
 
    return dMi, dKm, dFeet, dMeters
end


# This method is used to calculate the distance between two points using the
# Haversine Formula
 
def haversine_distance(point1, point2)
 
    lat1 = point1[0]
    lon1 = point1[1]
 
    lat2 = point2[0]
    lon2 = point2[1]
 
    dMi, dKm, dFeet, dMeters = haversine(lat1, lon1, lat2, lon2)
 
    return dMi, dKm, dFeet, dMeters
end
 
# This is the main method
 
def main
 
    point1 = [30.4550, -87.2350]
    point2 = [30.8495, -86.5344]
 
    distance = haversine_distance(point1, point2)
 
    puts "The distance between the two points is #{distance[0]} miles"
 
end
 
main